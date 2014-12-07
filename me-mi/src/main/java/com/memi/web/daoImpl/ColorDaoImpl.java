package com.memi.web.daoImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.memi.web.common.utils.Count;
import com.memi.web.common.utils.JDBCClose;
import com.memi.web.common.utils.JDBCconn;
import com.memi.web.dao.AbstractDao;
import com.memi.web.dao.ColorDao;
import com.memi.web.dto.ColorDto;
import com.memi.web.dto.CustDto;
import com.memi.web.dto.PagingDto;
@Repository
public class ColorDaoImpl implements ColorDao{
	JDBCconn jdbccon = null;
	 public ColorDaoImpl() {
		jdbccon = new JDBCconn();
	 }
	 @Override
		public Count getCount() throws Exception {
		    final Count count = new Count();
			new AbstractDao() {
				ResultSet rs = null;
				Connection con = null;
				PreparedStatement ps = null;
				String sql = "select COUNT(0) from COLOR";
				
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
			return count;
		}	
	
		public int getMaxColorSeq() throws Exception {
		final PagingDto top = new PagingDto();	
		 new AbstractDao() {
				ResultSet rs = null;
				Connection con = null;
				PreparedStatement ps = null;
				
				String sql = "select top 1 col_seq from COLOR " +
						"order by col_seq DESC";
				
				@Override
				public void query() throws Exception {
					con = jdbccon.getCon();
					ps = con.prepareStatement(sql);
					rs = ps.executeQuery();
					while(rs.next()){
						top.setCount(rs.getInt(1));
					}
					
				}
			}.execute();
			
			return top.getCount();
		}
	@SuppressWarnings("unchecked")
	@Override
		public List<ColorDto> getColorList(final PagingDto pageInfo) throws Exception {
		 @SuppressWarnings("rawtypes")
		final List list = new ArrayList();
		 new AbstractDao() {
				ResultSet rs = null;
				Connection con = null;
				PreparedStatement ps = null;
				ResultSetMetaData meta;
				int colCnt;
				String sql = "select top "
						+PagingDto.ROWS_PER_PAGE
						+" col_seq as colSeq , color  from COLOR where col_seq not in (select top ( "
						+pageInfo.getOffset()
						+") col_seq from COLOR order by col_seq DESC) order by col_seq DESC";
				@Override
				public void query() throws Exception {
					con = jdbccon.getCon();
					ps = con.prepareStatement(sql);
					rs = ps.executeQuery();
					meta = rs.getMetaData();
					colCnt = meta.getColumnCount();
					HashMap<String,Object> rsMap;
					while(rs.next()){
						rsMap = new HashMap<String,Object>();
						for(int i=0;i<colCnt;i++){
							rsMap.put(meta.getColumnName(i+1).toString().toLowerCase(),
							rs.getString(meta.getColumnName(i+1))
							);
						}
						list.add(rsMap);
					}
					
					
				}
			}.execute();
			return list;
		}
	 @Override
	 public List < ColorDto> getColors( String word )throws Exception{
		 return null;
	 }
	 
	 
	 @Override
		public ColorDto getColorById(final String id) throws Exception {
		final ColorDto color = new ColorDto();	
		 new AbstractDao() {
				
				Connection con = null;
				PreparedStatement ps = null;
				ResultSet rs = null;
				String sql="select color from COLOR where color='"+id+"'";
					
				@Override
				public void query() throws Exception {
					con = jdbccon.getCon();
					ps = con.prepareStatement(sql);
					rs = ps.executeQuery();
					if(rs.next()){
						color.setColor(rs.getString("color"));
					}
				}
			}.execute();
			return color;
		}
	@Override
	public void setColor(final ColorDto color) throws Exception {
		new AbstractDao() {
			Connection con = null;
			PreparedStatement ps = null;
			String sql = "insert into COLOR(color)" +
					"values('"+color.getColor()+"')";
			@Override
			public void query() throws Exception {
				con = jdbccon.getCon();
				ps = con.prepareStatement(sql);
				ps.executeUpdate();
				
			}
		}.execute();
		
	}
	 @Override
	 public void updateColor( List< ColorDto > params )throws Exception {
		 
	 }
	
	@Override
	public void deleteColor(final String id) throws Exception {
		new AbstractDao() {
			Connection con = null;
			PreparedStatement ps = null;
			String sql = "delete from COLOR where col_seq="+Integer.parseInt(id);
			@Override
			public void query() throws Exception {
				con = jdbccon.getCon();
				ps = con.prepareStatement(sql);
				ps.executeUpdate();
			}
		}.execute();
	}


}
