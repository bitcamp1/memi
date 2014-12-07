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
import com.memi.web.dao.TelecomDao;
import com.memi.web.dto.ColorDto;
import com.memi.web.dto.PagingDto;
import com.memi.web.dto.TelecomDto;
@Repository
public class TelecomDaoImpl implements TelecomDao{
	JDBCconn jdbc = null;
	
	
	public TelecomDaoImpl() {
		jdbc = new JDBCconn();
	}

	@Override
	public int getCount() throws Exception {
		final PagingDto count = new PagingDto();
		new AbstractDao() {
			ResultSet rs = null;
			Connection con = null;
			PreparedStatement ps = null;
			String sql = "select COUNT(0) from TELECOM";
			@Override
			public void query() throws Exception {
				con = jdbc.getCon();
				ps = con.prepareStatement(sql);
				rs = ps.executeQuery();
				while(rs.next()){
					count.setCount(rs.getInt(1));
				}
				
			}
		};
		return count.getCount();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<TelecomDto> getList(final PagingDto pageInfo) throws Exception {
		@SuppressWarnings("rawtypes")
		final List list = new ArrayList();
		new AbstractDao() {
			ResultSet rs = null;
			Connection con = null;
			PreparedStatement ps = null;
			ResultSetMetaData rd;
			int colCnt;
			String sql = "select * from TELECOM ";
			@Override
			public void query() throws Exception {
				con = jdbc.getCon();
				ps = con.prepareStatement(sql);
				rs = ps.executeQuery();
				rd = rs.getMetaData();
				colCnt = rd.getColumnCount();
				HashMap<String,Object>  rsMap;
				while(rs.next()){
					rsMap = new HashMap<String,Object>();  // 내부에서 map을 초기화
					for(int i=0; i<colCnt;i++){
						rsMap.put(rd.getColumnName(i+1).toString().toLowerCase(), 
							rs.getString(rd.getColumnName(i+1))	
						);
					}
			
					list.add(rsMap);
				}
				
			}
		}.execute();
		return list;
	}

	@Override
	public int getCountByWord(String word) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<TelecomDto> getSomeByWord(final PagingDto pageInfo, String word)throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TelecomDto getOneById(final String id) throws Exception {
		final TelecomDto telecom = new TelecomDto();
		new AbstractDao() {
			ResultSet rs = null;
			Connection con = null;
			PreparedStatement ps = null;
			String sql = "select color from COLOR where telecom = "+id;
			@Override
			public void query() throws Exception {
				con = jdbc.getCon();
				ps = con.prepareStatement(sql);
				rs = ps.executeQuery();
				while(rs.next()){
					telecom.setTelecom(rs.getString("telecom"));
				}
			}
		};
		
		return telecom;
	}

	@Override
	public void setOne(TelecomDto telecom) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(TelecomDto telecom) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int seq) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
