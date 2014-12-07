package com.memi.web.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.memi.web.dto.AjaxResult;
import com.memi.web.dto.PagingDto;
import com.memi.web.dto.TariffDto;
import com.memi.web.services.TariffService;
@RequestMapping(value="tariff")
@Controller("tariffController")
public class TariffController {
	@Autowired
	TariffService service;
	
	@RequestMapping(value="/list", method=RequestMethod.GET, produces="application/json" )
    public void getTariffList(
    		@RequestParam(required=false)String strPageNo, 
    		ModelMap model )throws Exception {
    	int totRow = service.getCount();  //총 데이터 건수
		String pageLinkUrl = "tariff/list.do"; // 페이지경로
		PagingDto pageInfo = new PagingDto(totRow,strPageNo,pageLinkUrl);
		List <TariffDto> list = new ArrayList<TariffDto>();
		list = service.getTariffList(pageInfo);
		System.out.println("CTRL tariff list size:"+list.size());
		model.addAttribute("list",list);
		model.addAttribute("totRow",totRow);
	}
    @RequestMapping(value="/search" ,method=RequestMethod. GET, produces="application/json")
    public List <TariffDto> getTariffByWord(@RequestParam(value= "/search",required=false) String param ,ModelMap model)throws Exception{
    	return null;
    }
    @RequestMapping(value="/retrieve" , produces= "application/json")
    public TariffDto getTariffByID(@RequestParam(value= "retrieve",required=false)String id,ModelMap model) throws Exception{
    	return null;
    }
    @RequestMapping(value="/get" , produces= "application/json")
    public TariffDto getTariffBySeq(@RequestParam(value= "get",required=false)int seq,ModelMap model) throws Exception{
    	return null;
    }
    @RequestMapping(value="/set" ,method=RequestMethod. GET, produces="application/json")
    public void setTariff(@RequestParam HashMap<String ,String> paramMap, ModelMap model)throws Exception{
    	
    }
    @RequestMapping(value="/update" ,method=RequestMethod. POST)
    public void updateTariff(@RequestParam(required= false)int seq, ModelMap model)throws Exception{
    	
    }
    @RequestMapping(value="/delete" ,method=RequestMethod. GET)
    public void deleteTariff(@RequestParam(required= false)int seq) throws Exception{}
}
