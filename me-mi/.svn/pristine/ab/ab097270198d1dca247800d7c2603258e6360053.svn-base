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

import org.apache.ibatis.annotations.Results;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.memi.web.common.utils.JDBCconn;
import com.memi.web.dao.AbstractDao;
import com.memi.web.dao.EmpDao;
import com.memi.web.dto.Employee;
import com.memi.web.dto.PagingDto;



@Repository
public class EmpDaoImpl implements EmpDao {
	@Value("${driverClassName}") String driver;
	@Value("${url}") String url;
	@Value("${username}") String id;
	@Value("${password}") String pw;
	JDBCconn jdbc = null;
	
	public EmpDaoImpl() {
		jdbc = new JDBCconn();
	}

	@Override
	public String login(HashMap<String, String> paramMap)
			throws DataAccessException {
		
		ResultSet rs = null;
		Connection con = null;
		PreparedStatement ps = null;
		
		String sql = "select emp_nm, emp_pw from EMP where emp_id=?";
		String tmp_nm = null;
		String tmp_pw = null;
		try {
			
			//1.JDBC Driver Loading
			Class.forName(driver);
			// 2. connect DB
			con = DriverManager.getConnection(url, id, pw);
			// 3. Statement 객체 생성
			
			
			ps = con.prepareStatement(sql);
			ps.setString(1, paramMap.get("uid"));
			rs=ps.executeQuery();
			ResultSetMetaData rsd = rs.getMetaData();
			
			while (rs.next()) {
				tmp_nm = rs.getString(1);
				tmp_pw = rs.getString(2);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			 if(rs != null){ try{ rs.close(); }catch(SQLException e){} }
	            if(ps != null){ try{ ps.close(); }catch(SQLException e){} }
	            if(con!= null){ try{ con.close(); }catch(SQLException e){} }
		}
		if(tmp_pw != null){
			return tmp_nm;
		}else{
			return null;
		}
		
	}

	@Override
	public void deleteEmployeeByID(String id) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getCountByWord(String word) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getMaxSeq() throws Exception {
		// seq 를 사용하지 않음..String id 
		return 0;
	}

	@Override
	public Employee getEmployeeByID(String id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getEmployeeBySeq(int seq) throws Exception {
		// seq 를 사용하지 않음..String id 
		return null;
	}

	@Override
	public List<Employee> getEmployeeByWord(String word) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getEmployeeCount() throws Exception {
		final PagingDto count = new PagingDto();
		new AbstractDao() {
			Connection con = null;
			PreparedStatement ps = null;
			ResultSet rs = null;
			String sql = "select COUNT(0) from EMP";
			
			@Override
			public void query() throws Exception {
				con = jdbc.getCon();
				ps = con.prepareStatement(sql);
				rs = ps.executeQuery();
				while(rs.next()){
					count.setCount(rs.getInt(1));
				}
				
			}
		}.execute();
		return count.getCount();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> getEmployeeList(final PagingDto pageInfo) throws Exception {
		@SuppressWarnings("rawtypes")
		final List list = new ArrayList();
		new AbstractDao() {
			Connection con = null;
			PreparedStatement ps = null;
			ResultSet rs = null;
			ResultSetMetaData meta = null;
			int colCnt;
			String sql = "select tel_no as telNo, eml,pho_no as phoNo,fax, emp_id as empId," +
					"shp_id,emp_duty as empDuty, emp_nm as empNm, shp_nm as shpNm   from EMP " +
					"inner join CONTACT on EMP.cnt_sq = CONTACT.cnt_sq " +
					"inner join SHOP on EMP.shp_sq = SHOP.shp_sq " +
					"order by emp_nm ASC";
					
			@Override
			public void query() throws Exception {
				con = jdbc.getCon();
				ps = con.prepareStatement(sql);
				rs = ps.executeQuery();
				meta =  rs.getMetaData();
				colCnt = meta.getColumnCount();
				HashMap<String,Object> rsMap;
				while(rs.next()){
					rsMap = new HashMap<String,Object>();
					for(int i=0; i<colCnt;i++){
						rsMap.put(meta.getColumnName(i+1).toString().toLowerCase(),
								rs.getString(meta.getColumnName(i+1)));
					}
					list.add(rsMap);
				}
				
			}
		}.execute();
		return list;
	}

	@Override
	public void setEmployee(Employee param) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateEmployee(Employee param) throws Exception {
		// TODO Auto-generated method stub
		
	}

	
}
