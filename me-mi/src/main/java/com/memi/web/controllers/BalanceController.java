package com.memi.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller("balanceController")
@RequestMapping("balance")
public class BalanceController {

	@RequestMapping(value = "/page", method = RequestMethod.GET)
	public ModelAndView goBalancePage(ModelAndView model) throws Exception {
		model.setViewName("account/balance");
		return model;
		
	}
	
	@RequestMapping(value = "/count", method = RequestMethod.GET, produces = "application/json")
	public void getBalanceCount(ModelMap model) throws Exception {
		// TODO Auto-generated method stub
		
	}

	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView getBalanceList(@RequestParam(required = false) String page,
			ModelAndView model) throws Exception {
		
		return model;
		
	}

	
	@RequestMapping(value = "/search", method = RequestMethod.GET, produces = "application/json")
	public void getBalances(@RequestParam(required = false) String word,
			ModelMap model) throws Exception {
		// TODO Auto-generated method stub
		
	}

	
	@RequestMapping(value = "/get", method = RequestMethod.GET, produces = "application/json")
	public void getBalanceById(@RequestParam(required = false) String id,
			ModelMap model) throws Exception {
		// TODO Auto-generated method stub
		
	}

	
	@RequestMapping(value = "/set", method = RequestMethod.POST)
	public void setBalance(@RequestParam(required = false) String param)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public void updateBalance(@RequestParam(required = false) String param)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public void deleteBalance(@RequestParam(required = false) String id)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

}
