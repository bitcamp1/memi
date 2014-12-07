package com.memi.web.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.memi.web.common.utils.Count;
import com.memi.web.dao.DteDao;
import com.memi.web.dto.Dte;
import com.memi.web.dto.PagingDto;
import com.memi.web.services.DteService;
@Service
public class DteServiceImpl implements DteService{
	@Autowired
	DteDao dao;
	@Override
	public void deleteDte(String id) throws Exception {
		dao.deleteDte(id);
		
	}

	@Override
	public Dte getDteById(String id) throws Exception {
		// TODO Auto-generated method stub
		return dao.getDteById(id);
	}

	@Override
	public Count getDteCount() throws Exception {
		// TODO Auto-generated method stub
		return dao.getDteCount();
	}

	@Override
	public List<Dte> getDteList(PagingDto pageInfo) throws Exception {
		// TODO Auto-generated method stub
		return dao.getDteList(pageInfo);
	}

	@Override
	public List<Dte> getDtes(String word) throws Exception {
		// TODO Auto-generated method stub
		return dao.getDtes(word);
	}

	@Override
	public void setDte(Dte dte) throws Exception {
		// TODO Auto-generated method stub
		dao.setDte(dte);
		
	}

	@Override
	public void updateDte(Dte dte) throws Exception {
		// TODO Auto-generated method stub
		dao.updateDte(dte);
	}

}
