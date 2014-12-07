package com.memi.web.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.memi.web.common.utils.Count;
import com.memi.web.dto.PagingDto;
import com.memi.web.dto.Usim;
import com.memi.web.services.UsimService;

@Controller("usimController")
@RequestMapping(value="usim")
public class UsimController {
	@Autowired
	UsimService service;


	
	@RequestMapping(value = "/count", method = RequestMethod.GET, produces = "application/json")
	public void getUsimCount(ModelMap model) throws Exception {
		// TODO Auto-generated method stub
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.GET, produces = "application/json")
	public void getUsimList(@RequestParam(required = false) String page,
			ModelMap model) throws Exception {
		String pageLinkUrl = "usim/list.do";
		Count count = new Count();
		count = service.getUsimCount();
		
		PagingDto pageInfo = new PagingDto(count.getCount(), page, pageLinkUrl);
		System.out.println("CTTRL LIST:"+service.getUsimList(pageInfo).size());
		model.addAttribute("totRow", count.getCount());
		model.addAttribute("list", service.getUsimList(pageInfo));
	}
	
	@RequestMapping(value = "/search", method = RequestMethod.GET, produces = "application/json")
	public List<Usim> getUsims(@RequestParam(required = false) String word,
			ModelMap model) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	@RequestMapping(value = "/get", method = RequestMethod.GET, produces = "application/json")
	public Usim getUsimByID(@RequestParam(required = false) String id,
			ModelMap model) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@RequestMapping(value = "/set", method = RequestMethod.POST)
	public void setUsim(Usim usim) throws Exception {
		// TODO Auto-generated method stub
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public void updateUsim(Usim usim) throws Exception {
		// TODO Auto-generated method stub

	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public void deleteUsimByID(@RequestParam(required = false) String id)
			throws Exception {
		// TODO Auto-generated method stub

	}
}
