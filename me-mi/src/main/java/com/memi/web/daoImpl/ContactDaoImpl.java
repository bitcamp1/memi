package com.memi.web.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.memi.web.common.utils.JDBCconn;
import com.memi.web.dao.AbstractDao;
import com.memi.web.dao.ContactDao;
import com.memi.web.dto.Contact;
import com.memi.web.dto.PagingDto;
/*
#1. count 전체수량 가져오기
#2. countByWord 검색결과 수량 가져오기 
#3. max 마지막 입력한 값 가져오기
#4. list 리스트 가져오기
#5. search 키워드로 검색하기
#6. retrieve ID 로 검색하기
#7. get SQ 로 검색하기
#8. set 등록하기
#9. update 수정하기
#10.delete 삭제하기
*/
@Repository
public class ContactDaoImpl implements ContactDao{
	JDBCconn jdbc = null;
	
	public ContactDaoImpl() {
		jdbc = new JDBCconn();
	}

	@Override
	public void deleteContactByID(String id) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getCountByWord(String word) throws Exception {
		// #2. countByWord 검색결과 수량 가져오기 
		return 0;
	}

	@Override
	public int getMaxSeq() throws Exception {
		// #3. max 마지막 입력한 값 가져오기
		final PagingDto top = new PagingDto();
		new AbstractDao() {
			Connection con = null;
			PreparedStatement ps = null;
			ResultSet rs = null;
			String sql =
					"select top 1 cnt_sq from CONTRACT order by cnt_sq DESC";
			@Override
			public void query() throws Exception {
				con = jdbc.getCon();
				ps = con.prepareStatement(sql);
				rs = ps.executeQuery();
				while (rs.next()) {
					top.setCount(rs.getInt("cnt_sq"));
				}
				
			}
		}.execute();
		return top.getCount();
	}

	@Override
	public Contact getContactByID(String id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Contact getContactBySeq(int seq) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Contact> getContactByWord(String word) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getContactCount() throws Exception {
		// #1. count 전체수량 가져오기
		final PagingDto count = new PagingDto();
		new AbstractDao() {
			Connection con = null;
			PreparedStatement ps = null;
			ResultSet rs = null;
			String sql = "select COUNT(*) from CONTACT";
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

	@Override
	public List<Contact> getContactList(final PagingDto pageInfo) throws Exception {
		// #4. list 리스트 가져오기
		final List<Contact> list = new ArrayList<Contact>();
		final Contact contact = new Contact();
		new AbstractDao() {
			Connection con = null;
			PreparedStatement ps = null;
			ResultSet rs = null;
			String sql = 
					"select top 20 * from CONTACT where cnt_sq not in (select top(" +
					pageInfo.getOffset() +
					")cnt_sq from CONTACT order by cnt_sq DESC) order by cnt_sq DESC";
			@Override
			public void query() throws Exception {
				con = jdbc.getCon();
				ps = con.prepareStatement(sql);
				rs = ps.executeQuery();
				while (rs.next()) {
					contact.setCntSq(rs.getInt("cnt_sq"));
					contact.setPhoNo(rs.getString("pho_no"));
					contact.setTelNo(rs.getString("tel_no"));
					contact.setFax(rs.getString("fax"));
					contact.setEml(rs.getString("eml"));
					list.add(contact);
				}
				
			}
		}.execute();
		System.out.println("DAO list+"+list);
		return list;
	}

	@Override
	public void setContact(Contact param) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateContact(Contact param) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
