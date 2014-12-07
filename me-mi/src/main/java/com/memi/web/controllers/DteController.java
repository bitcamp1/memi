package com.memi.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.memi.web.common.utils.Count;
import com.memi.web.dto.PagingDto;
import com.memi.web.services.DteService;

@Controller("dteController")
@RequestMapping("dte")
public class DteController{
	@Autowired
	DteService service;
	
	@RequestMapping(value = "/count", method = RequestMethod.GET, produces = "application/json")
	public void getDteCount(ModelMap model) throws Exception {
		Count count = new Count();
		count = service.getDteCount();
		model.addAttribute("count",count.getCount());
		
	}

	
	@RequestMapping(value = "/list", method = RequestMethod.GET, produces = "application/json")
	public void getDteList(@RequestParam(required = false) String page,
			ModelMap model) throws Exception {
		String pageLinkUrl = "dte/list.do";
		Count count = new Count();
		count = service.getDteCount();
		PagingDto pageInfo = new PagingDto(count.getCount(), page, pageLinkUrl);
		model.addAttribute("list", service.getDteList(pageInfo));
		
	}

	
	@RequestMapping(value = "/search", method = RequestMethod.GET, produces = "application/json")
	public void getDtes(@RequestParam(required = false) String word,
			ModelMap model) throws Exception {
		// TODO Auto-generated method stub
		
	}

	
	@RequestMapping(value = "/get", method = RequestMethod.GET, produces = "application/json")
	public void getDteById(@RequestParam(required = false) String id,
			ModelMap model) throws Exception {
		// TODO Auto-generated method stub
		
	}

	
	@RequestMapping(value = "/set", method = RequestMethod.POST)
	public void setDte(@RequestParam(required = false) String param)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public void updateDte(@RequestParam(required = false) String param)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public void deleteDte(@RequestParam(required = false) String id)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

}
