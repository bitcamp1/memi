package com.memi.web.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.memi.web.common.utils.Count;
import com.memi.web.common.utils.JDBCconn;
import com.memi.web.dao.AbstractDao;
import com.memi.web.dao.BalanceDao;
import com.memi.web.dto.Balance;
import com.memi.web.dto.PagingDto;
@Repository
public class BalanceDaoImpl implements BalanceDao{
	
	JDBCconn jdbc = null;
	
	
	public BalanceDaoImpl() {
		jdbc = new JDBCconn();
	}

	@Override
	public void deleteBalance(String id) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Balance getBalanceById(String id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getBalanceCount() throws Exception {
		
		final Count top = new Count();
		new AbstractDao() {
			Connection con = null;
			PreparedStatement ps = null;
			ResultSet rs = null;
			String sql = "select COUNT(0) from Balance";
			@Override
			public void query() throws Exception {
				con = jdbc.getCon();
				ps = con.prepareStatement(sql);
				rs = ps.executeQuery();
				while(rs.next()){
					top.setCount(rs.getInt(1));
				}
				
			}
		}.execute();
		
		return top.getCount();
	}

	@Override
	public List<Balance> getBalanceList(PagingDto pageInfo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Balance> getBalances(String word) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setBalance(Balance param) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateBalance(Balance param) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
