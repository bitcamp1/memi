package com.memi.web.services;

import java.util.HashMap;
import java.util.List;

import com.memi.web.common.utils.InterfaceTemplate;
import com.memi.web.dto.Employee;
import com.memi.web.dto.PagingDto;

public interface EmpService{

	public String login(HashMap<String, String> paramMap)throws Exception ;
	
	public void deleteEmployeeByID(String id) throws Exception;
	
	public int getCountByWord(String word) throws Exception;
	
	public int getMaxSeq() throws Exception;
	
	public Employee getEmployeeByID(String id) throws Exception;
	
	public Employee getEmployeeBySeq(int seq) throws Exception;
	
	public List<Employee> getEmployeeByWord(String word) throws Exception;
	
	public int getEmployeeCount() throws Exception;
	
	public List<Employee> getEmployeeList(PagingDto pageInfo) throws Exception;
	
	public void setEmployee(Employee param) throws Exception;
	
	public void updateEmployee(Employee param) throws Exception;

}
