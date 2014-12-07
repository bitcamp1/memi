package com.memi.web.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.memi.web.common.utils.Count;
import com.memi.web.dto.AjaxResult;
import com.memi.web.dto.ColorDto;
import com.memi.web.dto.PagingDto;
import com.memi.web.services.ColorService;

@Controller("colorController")
@RequestMapping(value = "color")
public class ColorContorller {
	@Autowired
	ColorService service;
	
	@RequestMapping(value = "/list", method=RequestMethod.GET,produces="application/json")
	public void getColorList(
			/*HttpServletRequest request*/
			@RequestParam(defaultValue = "1", value="page") String page ,ModelMap model
			) throws Exception{
		Count count = new Count();
		count = service.getCount();
		String pageLinkUrl = "color/list.do";
		PagingDto pageInfo = new PagingDto(count.getCount(),page,pageLinkUrl);
		List<ColorDto> list = service.getColorList(pageInfo);
		model.addAttribute("status",AjaxResult.SUCCESS);
		model.addAttribute("list", list);
		model.addAttribute("item","color");
		model.addAttribute("totRow", count.getCount());
		model.addAttribute("totPage",pageInfo.getTotPage());
		model.addAttribute("pageNo",pageInfo.getPageNo());
		model.addAttribute("limit",pageInfo.getLimit());
		model.addAttribute("startPage",pageInfo.getStartPage());
		model.addAttribute("endPage",pageInfo.getEndPage());
		model.addAttribute("pagesPerBlock",PagingDto.PAGES_PER_BLOCK);
		model.addAttribute("nowBlock",pageInfo.getNowBlock());
		
		
	}
	
	@RequestMapping(value = "/get", method=RequestMethod.GET,produces="application/json")        
	public void getColorById(@RequestParam(value="id") String id ,ModelMap model )throws Exception{
		ColorDto color = new ColorDto();
		color = service.getColorById(id);
		if (color != null) {
			model.addAttribute("status",AjaxResult.SUCCESS);
			model.addAttribute("color",color.getColor());
		}else{
			model.addAttribute("status", AjaxResult.FAIL);
		}
		
	}

	@RequestMapping(value = "color/add2", method=RequestMethod.POST)
	public void setColor(HttpServletRequest request) throws Exception{
		ColorDto color = new ColorDto();
		color.setColor(request.getParameter("color"));
		service.setColor(color);
		
	}
	
	@RequestMapping(value = "/update", method=RequestMethod.GET,produces="application/json")  
	public void updateColor(List<ColorDto> params)throws Exception{}

	@RequestMapping(value = "color/delete", method=RequestMethod.POST, produces="application/json")
	public void deleteColor(
			@RequestParam(required=false)String id
			) throws Exception{
		
		service.deleteColor(id);
		
		
	}
}
