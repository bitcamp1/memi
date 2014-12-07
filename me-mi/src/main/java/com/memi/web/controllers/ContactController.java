package com.memi.web.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.memi.web.dto.Contact;
import com.memi.web.dto.PagingDto;
import com.memi.web.services.ContactService;
@Controller
@RequestMapping("contact")
public class ContactController {

	@Autowired
	ContactService service;
	@RequestMapping(value = "/go", method = RequestMethod.GET, produces = "application/json")
	public String goContactPage() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	
	@RequestMapping(value = "/count", method = RequestMethod.GET, produces = "application/json")
	public void getContactCount(ModelMap model) throws Exception {
		model.addAttribute("count",service.getContactCount());
		
	}

	
	@RequestMapping(value = "/countByWord", method = RequestMethod.GET, produces = "application/json")
	public void getCountByWord(@RequestParam(required = false) String word,
			ModelMap model) throws Exception {
		// TODO Auto-generated method stub
		
	}

	
	@RequestMapping(value = "/max", method = RequestMethod.GET, produces = "application/json")
	public void getMaxSeq(ModelMap model) throws Exception {
		model.addAttribute("max",service.getMaxSeq());
		
	}

	
	@RequestMapping(value = "/list", method = RequestMethod.GET, produces = "application/json")
	public void getContactList(@RequestParam(required = false) String strPageNo,
			ModelMap model) throws Exception {
		int totRow = service.getContactCount();
		String url = "contact/list.do";
		PagingDto pageInfo = new PagingDto(totRow,strPageNo,url);
		List<Contact> list = new ArrayList<Contact>();
		
		model.addAttribute("list", service.getContactList(pageInfo));
	}

	
	@RequestMapping(value = "/search", method = RequestMethod.GET, produces = "application/json")
	public List<Contact> getContactByWord(String word) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	
	@RequestMapping(value = "/retrieve", method = RequestMethod.GET, produces = "application/json")
	public Contact getContactByID(String id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	
	@RequestMapping(value = "/get", method = RequestMethod.GET, produces = "application/json")
	public Contact getContactBySeq(int seq) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	
	@RequestMapping(value = "/set", method = RequestMethod.POST)
	public void setContact(Contact param) throws Exception {
		// TODO Auto-generated method stub
		
	}

	
	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public void updateContact(Contact param) throws Exception {
		// TODO Auto-generated method stub
		
	}

	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public void deleteContactByID(@RequestParam(required = false) int id)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	
}
