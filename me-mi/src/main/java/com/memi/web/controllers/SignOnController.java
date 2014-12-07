package com.memi.web.controllers;

import java.util.HashMap;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.memi.web.dto.AjaxResult;
import com.memi.web.dto.Employee;
import com.memi.web.services.EmpService;

@Controller("signOnController")
public class SignOnController {
	@Autowired
	EmpService service;
	
	@RequestMapping(value = "/sign", method=RequestMethod.GET)
	public String goLoginFrm() {
		
		return "/common/sign";
	}
	@RequestMapping(value="/login", method=RequestMethod.POST,produces="application/json")
	public void  login(String uid, 
				       String pwd,
				       HttpSession session,
				       ModelMap model)
			throws Exception {
		HashMap<String, String> paramMap = new HashMap<String, String>();
		
		paramMap.put("uid", uid);
		paramMap.put("pwd", pwd);
		
		session.setAttribute("uid", uid);
		String rt_val = service.login(paramMap);   
		
		if (rt_val != null) {
			model.addAttribute("status",AjaxResult.SUCCESS);
		}else{
			model.addAttribute("status", AjaxResult.FAIL);
		}
		
	}
	@RequestMapping(value = "/go", method = RequestMethod.GET)
	public String goMainPg() {
		
		return "/common/main";
	}
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String goMain() {
		
		return "/common/main";
	}
	
}
