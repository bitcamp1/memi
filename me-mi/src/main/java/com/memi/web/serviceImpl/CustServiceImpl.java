package com.memi.web.serviceImpl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.memi.web.dao.CustDao;
import com.memi.web.dto.CustDto;
import com.memi.web.dto.PagingDto;
import com.memi.web.services.CustService;

@Service
public class CustServiceImpl implements CustService{
	@Autowired
	CustDao dao;
	@Override
	public List<CustDto> selectAllCust(PagingDto pageInfo) throws Exception {
		return dao.selectAllCust(pageInfo);
	}

	@Override
	public int countAllRows() throws Exception{
		// TODO Auto-generated method stub
		return dao.countAllRows();
	}

	@Override
	public int getMaxValue() throws Exception {
		return dao.getMaxValue();
	}

}
