package com.memi.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller("statementController")
@RequestMapping("statement")
public class StatementController {

	@RequestMapping(value = "/month", method = RequestMethod.GET, produces = "application/json")
	public ModelAndView getStatementMonth() throws Exception {
		ModelAndView model = new ModelAndView();
		model.setViewName("account/month");
		return model;
		
	}
	
	@RequestMapping(value = "/count", method = RequestMethod.GET, produces = "application/json")
	public void getStatementCount(ModelMap model) throws Exception {
		// TODO Auto-generated method stub
		
	}

	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView getStatementList(@RequestParam(required = false) String page,
			ModelAndView model) throws Exception {
		model.setViewName("account/statement");
		return model;
		
	}

	
	@RequestMapping(value = "/search", method = RequestMethod.GET, produces = "application/json")
	public void getStatements(@RequestParam(required = false) String word,
			ModelMap model) throws Exception {
		// TODO Auto-generated method stub
		
	}

	
	@RequestMapping(value = "/get", method = RequestMethod.GET, produces = "application/json")
	public void getStatementById(@RequestParam(required = false) String id,
			ModelMap model) throws Exception {
		// TODO Auto-generated method stub
		
	}

	
	@RequestMapping(value = "/set", method = RequestMethod.POST)
	public void setStatement(@RequestParam(required = false) String param)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public void updateStatement(@RequestParam(required = false) String param)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public void deleteStatement(@RequestParam(required = false) String id)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

}
