package com.memi.web.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.memi.web.dto.Employee;
import com.memi.web.dto.PagingDto;
import com.memi.web.services.ContactService;
import com.memi.web.services.EmpService;

@Controller("empController")
@RequestMapping(value="emp")
public class EmpController {
	@Autowired
	EmpService service;
	Employee employee = new Employee();
	
	@RequestMapping(value = "/go", method = RequestMethod.GET, produces = "application/json")
	public String goEmployeePage() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	
	@RequestMapping(value = "/count", method = RequestMethod.GET, produces = "application/json")
	public void getEmployeeCount(ModelMap model) throws Exception {
		// TODO Auto-generated method stub
		
	}

	
	@RequestMapping(value = "/countByWord", method = RequestMethod.GET, produces = "application/json")
	public void getCountByWord(@RequestParam(required = false) String word,
			ModelMap model) throws Exception {
		// TODO Auto-generated method stub
		
	}

	
	@RequestMapping(value = "/max", method = RequestMethod.GET, produces = "application/json")
	public void getMaxSeq(ModelMap model) throws Exception {
		// TODO Auto-generated method stub
		
	}

	
	@RequestMapping(value = "/list", method = RequestMethod.GET, produces = "application/json")
	public void getEmployeeList(@RequestParam(required = false) String strPageNo,
			ModelMap model) throws Exception {
		int totRow = 0;
		String pageLinkUrl = "";
		PagingDto pageInfo = new PagingDto(totRow,strPageNo,pageLinkUrl);
		model.addAttribute("list",service.getEmployeeList(pageInfo));
	}

	
	@RequestMapping(value = "/search", method = RequestMethod.GET, produces = "application/json")
	public List<Employee> getEmployeeByWord(String word) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	
	@RequestMapping(value = "/retrieve", method = RequestMethod.GET, produces = "application/json")
	public Employee getEmployeeByID(String id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	
	@RequestMapping(value = "/get", method = RequestMethod.GET, produces = "application/json")
	public Employee getEmployeeBySeq(int seq) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	
	@RequestMapping(value = "/set", method = RequestMethod.POST)
	public void setEmployee(Employee param) throws Exception {
		// TODO Auto-generated method stub
		
	}

	
	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public void updateEmployee(Employee param) throws Exception {
		// TODO Auto-generated method stub
		
	}

	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public void deleteEmployeeByID(@RequestParam(required = false) int id)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

}
