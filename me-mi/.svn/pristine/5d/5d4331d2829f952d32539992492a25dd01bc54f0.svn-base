package com.memi.web.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.memi.web.dto.CustDto;
import com.memi.web.dto.PagingDto;
import com.memi.web.services.CustService;

@Controller("custController")
@RequestMapping(value = "cust")
public class CustController {
	@Autowired
	CustService service;
	@RequestMapping(value = "/add", method=RequestMethod.GET)public String goCustC() {return "/cust/cust_add";}
	@RequestMapping(value = "/detail", method=RequestMethod.GET)public String goCustU() {return "/cust/cust_edt";}
	@RequestMapping(value = "/list",method=RequestMethod.GET)
	public ModelAndView getCustList(
			//@RequestParam(defaultValue = "1") int pageNo //
			HttpServletRequest request
			)throws Exception{
		
		int totRow = service.countAllRows();  //총 데이터 건수
		String pageLinkUrl = "cust/list.do"; // 페이지경로
		String strPageNo = request.getParameter("page"); 
		PagingDto pageInfo = new PagingDto(totRow,strPageNo,pageLinkUrl);
		List<CustDto> list = service.selectAllCust(pageInfo);
		
		ModelAndView model=new ModelAndView();
		model.addObject("list", list);
		model.addObject("item","cust");
		model.addObject("totRow",pageInfo.getTotRow());
		model.addObject("totPage",pageInfo.getTotPage());
		model.addObject("maxSeq",service.getMaxValue());
		model.addObject("pageNo",pageInfo.getPageNo());
		model.addObject("limit",pageInfo.getLimit());
		model.addObject("startPage",pageInfo.getStartPage());
		model.addObject("endPage",pageInfo.getEndPage());
		model.addObject("pagesPerBlock",PagingDto.PAGES_PER_BLOCK);
		model.addObject("nowBlock",pageInfo.getNowBlock());
		model.setViewName("cust/cust");
		return model;
	}
	@RequestMapping(value = "/set",method=RequestMethod.GET)
	public ModelAndView setCustForm(){
		ModelAndView model = new ModelAndView();
		model.setViewName("cust/set");
		return model;
	}		
	@RequestMapping(value = "/month",method=RequestMethod.GET)
	public ModelAndView getLnbCustList(
			//@RequestParam(defaultValue = "1") int pageNo //
			HttpServletRequest request
			)throws Exception{
		
		int totRow = service.countAllRows();  //총 데이터 건수
		String pageLinkUrl = "cust/list.do"; // 페이지경로
		String strPageNo = request.getParameter("page"); 
		PagingDto pageInfo = new PagingDto(totRow,strPageNo,pageLinkUrl);
		List<CustDto> list = service.selectAllCust(pageInfo);
		
		ModelAndView model=new ModelAndView();
		model.addObject("list", list);
		model.addObject("item","cust");
		model.addObject("totRow",pageInfo.getTotRow());
		model.addObject("totPage",pageInfo.getTotPage());
		model.addObject("maxSeq",service.getMaxValue());
		model.addObject("pageNo",pageInfo.getPageNo());
		model.addObject("limit",pageInfo.getLimit());
		model.addObject("startPage",pageInfo.getStartPage());
		model.addObject("endPage",pageInfo.getEndPage());
		model.addObject("pagesPerBlock",PagingDto.PAGES_PER_BLOCK);
		model.addObject("nowBlock",pageInfo.getNowBlock());
		model.setViewName("cust/month");
		return model;
	}	
}
