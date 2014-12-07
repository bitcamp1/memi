package com.memi.web.services;

import java.util.List;

import com.memi.web.dto.Contact;
import com.memi.web.dto.PagingDto;

public interface ContactService {
	
	
	public void deleteContactByID(String id) throws Exception;
	
	public int getCountByWord(String word) throws Exception;
	
	public int getMaxSeq() throws Exception;
	
	public Contact getContactByID(String id) throws Exception;
	
	public Contact getContactBySeq(int seq) throws Exception;
	
	public List<Contact> getContactByWord(String word) throws Exception;
	
	public int getContactCount() throws Exception;
	
	public List<Contact> getContactList(PagingDto pageInfo) throws Exception;
	
	public void setContact(Contact param) throws Exception;
	
	public void updateContact(Contact param) throws Exception;
	
}
