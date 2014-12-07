package com.memi.web.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.memi.web.dao.TelecomDao;
import com.memi.web.dto.PagingDto;
import com.memi.web.dto.TelecomDto;
import com.memi.web.services.TelecomService;
@Service
public class TelecomServiceImpl implements TelecomService{
@Autowired
TelecomDao dao;
	@Override
	public int getCount() throws Exception {
		// TODO Auto-generated method stub
		return dao.getCount();
	}

	@Override
	public List<TelecomDto> getList(PagingDto pageInfo) throws Exception {
		// TODO Auto-generated method stub
		return dao.getList(pageInfo);
	}

	@Override
	public int getCountByWord(String word) throws Exception {
		// TODO Auto-generated method stub
		return dao.getCountByWord( word);
	}

	@Override
	public List<TelecomDto> getSomeByWord(PagingDto pageInfo, String word)
			throws Exception {
		// TODO Auto-generated method stub
		return dao.getSomeByWord( pageInfo, word);
	}

	@Override
	public TelecomDto getOneById(String id) throws Exception {
		// TODO Auto-generated method stub
		return dao.getOneById(id);
	}

	@Override
	public void setOne(TelecomDto telecom) throws Exception {
		dao.setOne(telecom);
		
	}

	@Override
	public void update(TelecomDto telecom) throws Exception {
		dao.update(telecom);
		
	}

	@Override
	public void delete(int seq) throws Exception {
		dao.delete(seq);
		
	}

}
