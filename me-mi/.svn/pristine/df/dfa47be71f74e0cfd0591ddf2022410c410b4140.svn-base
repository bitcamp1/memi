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
import com.memi.web.dao.ShopDao;
import com.memi.web.dto.PagingDto;
import com.memi.web.dto.ShopDto;
@Repository
public class ShopDaoImpl implements ShopDao{
	JDBCconn jdbc = null;
	public ShopDaoImpl() {
		jdbc=new JDBCconn();
	}

	@Override
	public int getCount() throws Exception {
		final PagingDto count = new PagingDto();
		new AbstractDao() {
			Connection con = null;
			PreparedStatement ps = null;
			ResultSet rs = null;
			String sql = "select COUNT(0) from SHOP";
			@Override
			public void query() throws Exception {
				// TODO Auto-generated method stub
				con = jdbc.getCon();
				ps = con.prepareStatement(sql);
				rs = ps.executeQuery();
				while (rs.next()) {
					count.setCount(rs.getInt(1));
				}
			}
		}.execute();
		
		return count.getCount();
	}

	@Override
	public int getCountByWord(String word) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getMaxSeq() throws Exception {
		// TODO Auto-generated method stub
		final PagingDto count = new PagingDto();
		new AbstractDao() {
			Connection con = null;
			PreparedStatement ps = null;
			ResultSet rs = null;
			String sql 
			= "select top 1 shp_sq from SHOP order by shp_sq DESC";
			@Override
			public void query() throws Exception {
				con = jdbc.getCon();
				ps = con.prepareStatement(sql);
				rs = ps.executeQuery();
				while(rs.next()){
					count.setCount(rs.getInt("shp_sq"));
				}
			}
		}.execute();
		return count.getCount();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ShopDto> getShopList(final PagingDto pageInfo) throws Exception {
		// TODO Auto-generated method stub
		@SuppressWarnings("rawtypes")
		final List list = new ArrayList();
		new AbstractDao() {
			Connection con = null;
			PreparedStatement ps = null;
			ResultSet rs = null;
			ResultSetMetaData meta = null;
			int colCnt;
			String sql = "select shp_id as shopId, shp_nm as shopNm , shp_tp as shopTp,zip ,juso  from " +
					"SHOP";
			@Override
			public void query() throws Exception {
				con = jdbc.getCon();
				ps = con.prepareStatement(sql);
				rs = ps.executeQuery();
				meta = rs.getMetaData();
				colCnt = meta.getColumnCount();
				HashMap<String,Object>rsMap ;
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
	public List<ShopDto> getShopsByWord(String word) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ShopDto getShopByID(final String id) throws Exception {
		final ShopDto shop = new ShopDto();
		new AbstractDao() {
			Connection con = null;
			PreparedStatement ps = null;
			ResultSet rs = null;
			String sql = "select top 20 " +
					"s.shp_sq as shopSeq," +
					"s.shp_nm as shopName," +
					"s.shp_id as shopID," +
					"s.shp_pw as shopPW," +
					"s.zip as zip," +
					"s.ct_seq as contactSeq," +
					"s.juso as juso," +
					"s.shp_tp as shopType," +
					"s.rg_dt as registDate," +
					"c.pho_no as phoneNum," +
					"c.tel_no as telNum," +
					"c.fax as fax," +
					"c.eml as email" +
					"from SHOP s inner join CONTACT c " +
					"on s.ct_seq = c.cnt_sq " +
					"where shp_sq = "+id+" order by shp_sq DESC";
			@Override
			public void query() throws Exception {
				con=jdbc.getCon();
				ps=con.prepareStatement(sql);
				rs=ps.executeQuery();
				while(rs.next()){
					shop.setShopSq(rs.getInt("shopSeq"));
					shop.setShopNm(rs.getString("shopName"));
					shop.setShopId(rs.getString("shopID"));
					shop.setShopPw(rs.getString("shopPW"));
					shop.setZip(rs.getString("zip"));
					shop.setCntSeq(rs.getInt("contactSeq"));
					shop.setJuso(rs.getString("juso"));
					shop.setShopTp(rs.getString("shopType"));
					shop.setRgDt(rs.getString("registDate"));
					shop.setPhoNo(rs.getString("phoneNum"));
					shop.setTelNo(rs.getString("telNum"));
				}
			}
		}.execute();
		return shop;
	}

	@Override
	public ShopDto getShopBySeq(int seq) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setShop(ShopDto param) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateShop(ShopDto param) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteShopByID(String id) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
