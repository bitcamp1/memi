package com.memi.web.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.memi.web.dao.TariffDao;
import com.memi.web.dto.PagingDto;
import com.memi.web.dto.TariffDto;
import com.memi.web.services.TariffService;
@Service
public class TariffServiceImpl implements TariffService{
	@Autowired
	TariffDao dao;

	@Override
	public int getCount() throws Exception {
		// TODO Auto-generated method stub
		return dao.getCount();
	}

	@Override
	public int getCountByWord(String word) throws Exception {
		// TODO Auto-generated method stub
		return dao.getCountByWord(word);
	}

	@Override
	public int getMaxSeq() throws Exception {
		// TODO Auto-generated method stub
		return dao.getMaxSeq();
	}

	@Override
	public List<TariffDto> getTariffList(PagingDto pageInfo) throws Exception {
		// TODO Auto-generated method stub
		return dao.getTariffList(pageInfo);
	}

	@Override
	public List<TariffDto> getTariffsByWord(String word) throws Exception {
		// TODO Auto-generated method stub
		return dao.getTariffsByWord(word);
	}

	@Override
	public TariffDto getTariffByID(String id) throws Exception {
		// TODO Auto-generated method stub
		return dao.getTariffByID(id);
	}

	@Override
	public TariffDto getTariffBySeq(int seq) throws Exception {
		// TODO Auto-generated method stub
		return dao.getTariffBySeq(seq);
	}

	@Override
	public void setTariff(TariffDto param) throws Exception {
		dao.setTariff(param);
		
	}

	@Override
	public void updateTariff(TariffDto param) throws Exception {
		dao.updateTariff(param);
		
	}

	@Override
	public void deleteTariffByID(int id) throws Exception {
		dao.deleteTariffByID(id);
	}

	

}
