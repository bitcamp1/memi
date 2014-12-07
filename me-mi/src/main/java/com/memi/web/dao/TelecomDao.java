package com.memi.web.dao;

import java.util.List;

import com.memi.web.dto.PagingDto;
import com.memi.web.dto.TelecomDto;

public interface TelecomDao {

	public int getCount() throws Exception ;

	public List<TelecomDto> getList(PagingDto pageInfo) throws Exception ;

	public int getCountByWord(String word) throws Exception ;

	public List<TelecomDto> getSomeByWord(PagingDto pageInfo, String word) throws Exception ;

	public TelecomDto getOneById(String id) throws Exception ;

	public void setOne(TelecomDto telecom) throws Exception ;

	public void update(TelecomDto telecom) throws Exception ;

	public void delete(int seq) throws Exception ;

}
