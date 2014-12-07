package com.memi.web.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.memi.web.dto.AjaxResult;
import com.memi.web.dto.PagingDto;
import com.memi.web.dto.ShopDto;
import com.memi.web.services.ShopService;

@Controller
@RequestMapping("shop")
public class ShopController {
	@Autowired
	ShopService service;
	
	@RequestMapping(value = "/count", method=RequestMethod.GET,produces="application/json")        
	public void getCount(ModelMap model)throws Exception{
	     model.addAttribute("count",service.getCount());
	}
	@RequestMapping(value = "/countByWord", method=RequestMethod.GET,produces="application/json")  
	public void getCountByWord( 
	       @RequestParam(required=false)String word,ModelMap model
	     ) throws Exception {
	     
	     model.addAttribute("countByWord",service.getCountByWord(word));
	}

	@RequestMapping(value = "/max", method=RequestMethod.GET,produces="application/json")        
	public void getMaxSeq(ModelMap model)throws Exception{
	     model.addAttribute("max",service.getMaxSeq());
	}

	
	@RequestMapping(value = "/list", method=RequestMethod.GET,produces="application/json")        
	public void getShopList(
			 @RequestParam(required=false)String strPageNo, 
             ModelMap model )throws Exception{
	   int totRow = service.getCount();  //총 데이터 건수
	   String pageLinkUrl = "shop/list.do"; // 페이지경로
	   PagingDto pageInfo = new PagingDto(totRow,strPageNo,pageLinkUrl);
	   
	   model.addAttribute("list",service.getShopList(pageInfo));
	   model.addAttribute("totRow",totRow);
	}

	@RequestMapping(value = "/search", method=RequestMethod.GET,produces="application/json")               
	public List <ShopDto> getShopByWord(String word)throws Exception{return null;}

	@RequestMapping(value = "/retrieve", method=RequestMethod.GET,produces="application/json")        
	public ShopDto getShopByID(String id )throws Exception{return null;}

	@RequestMapping(value = "/get", method=RequestMethod.GET,produces="application/json")          
	public ShopDto getShopBySeq(int seq)throws Exception{return null;}

	@RequestMapping(value = "/set", method=RequestMethod.POST)  
	public void setShop(ShopDto param)throws Exception{}

	@RequestMapping(value = "/update", method=RequestMethod.GET)  
	public void updateShop(ShopDto param)throws Exception{}

	@RequestMapping(value = "/delete", method=RequestMethod.GET)        
	public void deleteColorByID(@RequestParam(required=false)int id)throws Exception{}
	       

}
