package com.memi.web.daoImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.memi.web.common.utils.JDBCClose;
import com.memi.web.common.utils.JDBCconn;
import com.memi.web.dao.CustDao;
import com.memi.web.dto.CustDto;
import com.memi.web.dto.PagingDto;

@Repository("custDaoImpl")
public class CustDaoImpl implements CustDao{
	@Value("${driverClassName}") String driver;
	@Value("${url}") String url;
	@Value("${username}") String id;
	@Value("${password}") String pw;
	  
	
	JDBCconn jdbccon = null;
	 public CustDaoImpl() {
		jdbccon = new JDBCconn();
	 }
    
      
	
	@SuppressWarnings("unchecked")
	@Override
	public List<CustDto> selectAllCust(PagingDto pageInfo) throws Exception {
		ResultSet rs = null;
		Connection con = null;
		PreparedStatement ps = null;
		
		String sql = "select top "
				+PagingDto.ROWS_PER_PAGE
				+" * from CUST where cust_id not in (select top ( "
				+pageInfo.getOffset()
				+") cust_id from CUST order by cust_id DESC) order by cust_id DESC";
				
		@SuppressWarnings("rawtypes")
		List custList = new ArrayList();		
		ResultSetMetaData rd;
		int colCnt;
		
		try {
			con = jdbccon.getCon();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			rd = rs.getMetaData();
			colCnt = rd.getColumnCount();
			HashMap<String,Object>  rsMap;
			while (rs.next()) {
				rsMap = new HashMap<String,Object>();  // 내부에서 map을 초기화
				for(int i=0; i<colCnt;i++){
					rsMap.put(rd.getColumnName(i+1).toString().toLowerCase(), 
						rs.getString(rd.getColumnName(i+1))	
					);
				}
		
			custList.add(rsMap);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCClose.close(con, ps, rs);
		}
		return custList;
	}

	
	

	@Override
	public int getMaxValue() throws Exception {
		ResultSet rs = null;
		Connection con = null;
		PreparedStatement ps = null;
		
		String sql = "select TOP 1 cust_id from CUST where cust_id=(select MAX(cust_id)from CUST) order by cust_id DESC";
			
		int maxValue = 0;
		
		try {
			con = jdbccon.getCon();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
		System.out.println("rs = ps.executeQuery(); 다음");
				while(rs.next()){
					
					maxValue = rs.getInt(1);
					System.out.println("maxValue:"+maxValue);
				}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			JDBCClose.close(con, ps, rs);
		}
		return maxValue;
	}
	@Override
	public int countAllRows() throws Exception {
		ResultSet rs = null;
		Connection con = null;
		PreparedStatement ps = null;
		
		String sql = "select COUNT(0) from CUST";
			
		int countNum = 0;
		
		try {
			con = jdbccon.getCon();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()){
				countNum = rs.getInt(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			JDBCClose.close(con, ps, rs);
		}
		return countNum;
	}
	

}
