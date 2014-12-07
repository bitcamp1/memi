package com.memi.web.common.utils;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public interface ControllerTemplate {

	@RequestMapping(value = "/count", method=RequestMethod.GET,produces="application/json")        
	public void getObjectCount(ModelMap model)throws Exception;
	
	@RequestMapping(value = "/list", method=RequestMethod.GET,produces="application/json")        
	public void getObjectList(@RequestParam(required=false)String page,ModelMap model )throws Exception ;

	@RequestMapping(value = "/search", method=RequestMethod.GET,produces="application/json")               
	public void getObjects(@RequestParam(required=false)String word,ModelMap model)throws Exception;

	@RequestMapping(value = "/get", method=RequestMethod.GET,produces="application/json")        
	public void getObjectById(@RequestParam(required=false)String id,ModelMap model)throws Exception;
	

	@RequestMapping(value = "/set", method=RequestMethod.POST)  
	public void setObject(@RequestParam(required=false)String param)throws Exception;

	@RequestMapping(value = "/update", method=RequestMethod.POST)  
	public void updateObject(@RequestParam(required=false)String param)throws Exception;

	@RequestMapping(value = "/delete", method=RequestMethod.GET)        
	public void deleteObject(@RequestParam(required=false)String id)throws Exception;
	       

}
