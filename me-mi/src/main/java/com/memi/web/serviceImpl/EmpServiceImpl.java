package com.memi.web.serviceImpl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.memi.web.daoImpl.EmpDaoImpl;
import com.memi.web.dto.Employee;
import com.memi.web.dto.PagingDto;
import com.memi.web.services.EmpService;

@Service
public class EmpServiceImpl implements EmpService{
	@Autowired
	EmpDaoImpl dao;
	
	@Override
	public String login(HashMap<String, String> paramMap)throws Exception {
		return dao.login(paramMap);
	}

	@Override
	public void deleteEmployeeByID(String id) throws Exception {
		dao.deleteEmployeeByID(id);
		
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
	public Employee getEmployeeByID(String id) throws Exception {
		// TODO Auto-generated method stub
		return dao.getEmployeeByID(id);
	}

	@Override
	public Employee getEmployeeBySeq(int seq) throws Exception {
		// TODO Auto-generated method stub
		return dao.getEmployeeBySeq(seq);
	}

	@Override
	public List<Employee> getEmployeeByWord(String word) throws Exception {
		// TODO Auto-generated method stub
		return dao.getEmployeeByWord(word);
	}

	@Override
	public int getEmployeeCount() throws Exception {
		// TODO Auto-generated method stub
		return dao.getEmployeeCount();
	}

	@Override
	public List<Employee> getEmployeeList(PagingDto pageInfo) throws Exception {
		// TODO Auto-generated method stub
		return dao.getEmployeeList(pageInfo);
	}

	@Override
	public void setEmployee(Employee param) throws Exception {
		dao.setEmployee(param);
		
	}

	@Override
	public void updateEmployee(Employee param) throws Exception {
		dao.updateEmployee(param);
		
	}

}
