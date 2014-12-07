package com.memi.web.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.memi.web.common.utils.Count;
import com.memi.web.common.utils.JDBCconn;
import com.memi.web.dao.AbstractDao;
import com.memi.web.dao.DteDao;
import com.memi.web.dto.Dte;
import com.memi.web.dto.PagingDto;
@Repository
public class DteDaoImpl implements DteDao{
	JDBCconn jdbc = null;
	
	

	public DteDaoImpl() {
		jdbc = new JDBCconn();
	}

	@Override
	public void deleteDte(String id) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Dte getDteById(String id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Count getDteCount() throws Exception {
		final Count count = new Count();
		new AbstractDao() {
			Connection con = null;
			PreparedStatement ps = null;
			ResultSet rs = null;
			String sql = "select count(0) from DTE";
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
		return count;
	}

	@Override
	public List<Dte> getDteList(final PagingDto pageInfo) throws Exception {
		@SuppressWarnings("rawtypes")
		final List list = new ArrayList();
		new AbstractDao() {
			Connection con = null;
			PreparedStatement ps = null;
			ResultSet rs = null;
			ResultSetMetaData meta;
			int colCnt;
			String sql = "select dte_nm as name, dte_mdl as model, dte_won as price, maker , telecom from DTE";
			@Override
			public void query() throws Exception {
				con = jdbc.getCon();
				ps = con.prepareStatement(sql);
				rs = ps.executeQuery();
				meta = rs.getMetaData();
				colCnt = meta.getColumnCount();
				HashMap<String,Object> rsMap;
				while (rs.next()) {
					rsMap = new HashMap<String,Object>();
					for (int i = 0; i < colCnt; i++) {
						rsMap.put(meta.getColumnName(i+1).toString().toLowerCase(),rs.getString(meta.getColumnName(i+1)));
					}
					
					list.add(rsMap);
				}
				
			}
		}.execute();
		return list;
	}

	@Override
	public List<Dte> getDtes(String word) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setDte(Dte dte) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateDte(Dte dte) throws Exception {
		// TODO Auto-generated method stub
		
	}


}
