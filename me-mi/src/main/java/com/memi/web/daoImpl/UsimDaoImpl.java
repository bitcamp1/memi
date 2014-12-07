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
import com.memi.web.dao.UsimDao;
import com.memi.web.dto.PagingDto;
import com.memi.web.dto.Usim;
@Repository
public class UsimDaoImpl implements UsimDao{
	JDBCconn jdbc = null;
	 public UsimDaoImpl() {
		jdbc = new JDBCconn();
	 }
    

	@Override
	public void deleteUsim(String id) throws Exception {
		// TODO Auto-generated method stub
		
	}



	@Override
	public Usim getUsimById(String id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Usim> getUsims(String word) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Count getUsimCount() throws Exception {
		final Count count = new Count();
		new AbstractDao() {
			Connection con = null;
			PreparedStatement ps = null;
			ResultSet rs = null;
			String sql = "select COUNT(0) from USIM";
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
		return count;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<Usim> getUsimList(PagingDto pageInfo) throws Exception {
		@SuppressWarnings("rawtypes")
		final List list = new ArrayList();
		new AbstractDao() {
			Connection con = null;
			PreparedStatement ps = null;
			ResultSet rs = null;
			ResultSetMetaData meta;
			int colCnt;
			String sql = "select "
					+"usim_no as usimNo, usim_mdl as usimMdl, usim_won as usimWon, usim_pay_tm as usimPayTm, cust_id as custId" +
					" from USIM ";
			
			@Override
			public void query() throws Exception {
				con = jdbc.getCon();
				ps = con.prepareStatement(sql);
				rs = ps.executeQuery();
				meta = rs.getMetaData();
				colCnt = meta.getColumnCount();
				HashMap<String,Object>rsMap;
				while(rs.next()){
					rsMap = new HashMap<String,Object>();
					for (int i = 0; i < colCnt; i++) {
						rsMap.put(meta.getColumnName(i+1).toString().toLowerCase(), rs.getString(meta.getColumnName(i+1)));
					}
					list.add(rsMap);
				}
				
			}
		}.execute();
		return list;
	}

	@Override
	public void setUsim(Usim param) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateUsim(Usim param) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
