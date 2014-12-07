package com.memi.web.controllers;

import java.util.HashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.memi.web.dto.PagingDto;
import com.memi.web.dto.TelecomDto;
import com.memi.web.services.TelecomService;
@RequestMapping("telecom")
@Controller("telecomController")
public class TelecomController {
	@Autowired
	TelecomService service;
	
	@RequestMapping(value="/count")
	public int getCount()throws Exception{
		return service.getCount();
	}
	@RequestMapping(value="/countBySearch")
	public int getCountByWord(@RequestParam(required=false)String word)throws Exception{
		return service.getCountByWord(word);
	}
	@RequestMapping(value="/list",method=RequestMethod.GET,produces="application/json")
	public void getList(@RequestParam(defaultValue="1",required=false)int page, ModelMap model)throws Exception{
		String pageLinkUrl = "telecom/list.do"; // 페이지경로
		String strPageNo = String.valueOf(page); 
		PagingDto pageInfo = new PagingDto(service.getCount(),strPageNo,pageLinkUrl);
		model.addAttribute("list",service.getList(pageInfo));
		model.addAttribute("totRow",service.getCount());
	}
	@RequestMapping(value="/search",method=RequestMethod.GET,produces="application/json")
	public void getSomeByWord(@RequestParam(value="telecom",required=false) String word,ModelMap model)throws Exception{
	}
	@RequestMapping(value="/get",method=RequestMethod.GET, produces="application/json")
	public void getOneById(@RequestParam(value="telecom",required=false)String id,ModelMap model)throws Exception{
		model.addAttribute("telecom", service.getOneById(id));
	}
	@RequestMapping(value="/set",method=RequestMethod.GET, produces="application/json")
	public void setOne(@RequestParam HashMap<String,String>paramMap, ModelMap model)throws Exception{
		
		service.setOne(new TelecomDto());
	}
	@RequestMapping(value="/update",method=RequestMethod.POST,produces="application/json")
	public void update(@RequestParam(required=false)int seq,ModelMap model)throws Exception{
		service.update(new TelecomDto());
	}
	@RequestMapping(value="/delete",method=RequestMethod.GET,produces="application/json")
	public void delete(@RequestParam(required=false)int seq)throws Exception{
		service.delete(seq);
	}
	
	
}
