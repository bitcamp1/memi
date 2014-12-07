package com.memi.web.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.memi.web.common.utils.JDBCconn;
import com.memi.web.dao.AbstractDao;
import com.memi.web.dao.TariffDao;
import com.memi.web.dto.PagingDto;
import com.memi.web.dto.TariffDto;
import com.memi.web.dto.TelecomDto;
@Repository
public class TariffDaoImpl implements TariffDao{
	JDBCconn jdbccon = null;
	public TariffDaoImpl() {
		jdbccon=new JDBCconn();
	}

	@Override
	public int getCount() throws Exception {
		
		final PagingDto count = new PagingDto();
		new AbstractDao() {
			ResultSet rs = null;
			Connection con = null;
			PreparedStatement ps = null;
			String sql="select COUNT(0) from TARIFF2";
			@Override
			public void query() throws Exception {
				con = jdbccon.getCon();
				ps = con.prepareStatement(sql);
				rs = ps.executeQuery();
				while(rs.next()){
					count.setCount(rs.getInt(1));
				}
				
			}
		}.execute();
		return count.getCount();
	}
	@Override
	public int getCountByWord(String word)throws Exception{
		return 0;
	}  
	@Override
	public int getMaxSeq()throws Exception{
		return 0;
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<TariffDto> getTariffList(final PagingDto pageInfo) throws Exception {
		@SuppressWarnings("rawtypes")
		final List list = new ArrayList();
		new AbstractDao() {
			 ResultSet rs = null;
             Connection con = null;
             PreparedStatement ps = null;
             ResultSetMetaData rd;
             int colCnt;
             
             String sql = "select top "
                       +PagingDto.ROWS_PER_PAGE
                       +" * from TARIFF2 where tf_seq not in (select top ( "
                       +pageInfo.getOffset()
                       +") tf_seq from TARIFF2 order by tf_seq DESC) order by tf_seq DESC";
			@Override
			public void query() throws Exception {
				 con = jdbccon.getCon();
                 ps = con.prepareStatement(sql);
                 rs = ps.executeQuery();
                 rd = rs.getMetaData();
                 colCnt = rd.getColumnCount();
                 HashMap<String,Object>  rsMap;
                 while(rs.next()){
                      rsMap = new HashMap<String,Object>();  // 내부에서 map을 초기화
                      for(int i=0; i<colCnt;i++){
                           rsMap.put(rd.getColumnName(i+1).toString().toLowerCase(), 
                                rs.getString(rd.getColumnName(i+1)));
                         
                      }
                      list.add(rsMap);
                      
                 }

				
			}}.execute();
		return list;
	}


	@Override
	public List<TariffDto> getTariffsByWord(String word)throws Exception {
			
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TariffDto getTariffByID(String id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public TariffDto getTariffBySeq(int seq) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setTariff(TariffDto param) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateTariff(TariffDto param) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteTariffByID(int id) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
