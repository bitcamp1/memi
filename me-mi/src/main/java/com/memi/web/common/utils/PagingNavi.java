package com.memi.web.common.utils;

import com.memi.web.dto.PagingDto;

public class PagingNavi {
		public static String pagingNavi(String self_url, String queryString, int max_num, int list_num, int int_pg) {
		    StringBuffer buf  = new StringBuffer("\r\n");
		    String tmp        = "";
		    int pagePerGroup     = 5; //( << < 1 2 3 4 5 > >>) 
		    System.out.println("StringBuffer buf :" +buf);

		    if(queryString == null) queryString ="";
		    queryString = queryString.trim();
		    
		   
		   // int idx = queryString.indexOf("&req_pg");
		    int idx = queryString.indexOf("page=");
		    
		    
		    if(idx > -1) {            
		      tmp = queryString.substring(0,idx);
		      if((idx = queryString.indexOf("&",idx+1)) > 0) {
		          queryString = tmp + queryString.substring(idx);
		      }else {
		          queryString = tmp;
		      }//end_else
		    }//end if(idx)
		    
		   
		    int page_cnt = (int)Math.ceil(max_num*1.0f/list_num);
		    int start_pg = ((int_pg % pagePerGroup) > 0) ? ((int)(int_pg/pagePerGroup)*pagePerGroup + 1) : (((int)(int_pg/pagePerGroup)-1)*pagePerGroup + 1);
		    int last_pg  = page_cnt;
		    
		   
		    if (start_pg != 1) {
				buf.append("<a href='" + self_url + "?" + queryString + "page=" + "1" + "'>"
						+ "<img src = /cubridTest/img//btn_gray_prv2.gif border=0> " 	 
						+ "</a>"
						+ "<a href='" 
						+ self_url 
						+ "?" 
						+ queryString 
						+ "page=" 
						+ (start_pg - 1) + "'>"
						+ "<img src = /cubridTest/img//btn_gray_prv1.gif border=0> " 
						+ "</a>" 
						+ "<img src=/cubridTest/img//cyan_bg_003.gif>");
		    }else{
				buf.append("<img src = /cubridTest/img//btn_gray_prv2.gif><img src = /cubridTest/img//btn_gray_prv1.gif>" 
		                 + "<img src=/cubridTest/img//cyan_bg_003.gif>");
		    }
		    
		    for(int i=start_pg; i<= (start_pg + (pagePerGroup-1)); i++)  {
		      	if ( i > page_cnt) break;
	            if(i == int_pg) {
		        	buf.append("<FONT size=2 color=red> "+ i +" </font>" + "<img src=/cubridTest/img//cyan_bg_003.gif>");
		      	} else {
		        	buf.append("<a href='" + self_url + "?"+ queryString +"page" + i + "'><FONT size=2> " + i + " </font></a>" 
		      	                           + "<img src=/cubridTest/img//cyan_bg_003.gif>");
		      	}
				last_pg++;
		    }//end_for
		    
		    if ((start_pg + (pagePerGroup-1)) < page_cnt) {
				buf.append("<a href='" + self_url + "?" + queryString + "page=" + (start_pg + pagePerGroup) + "'>"
						+ "<img src = /cubridTest/img//btn_gray_next1.gif border=0>" 	
						+ "</a>"
						+ "<a href='" + self_url + "?" + queryString + "page=" + (page_cnt) + "'>"
						+ "<img src = /cubridTest/img//btn_gray_next2.gif border=0>" + "</a>");
		    } else{
		      	buf.append("<img src = /cubridTest/img//btn_gray_next1.gif><img src = /cubridTest/img//btn_gray_next2.gif>"); 
		    }
		            
		    return buf.toString();        
		          
	    }
		
		public static String date_format(String data_s) throws Exception {
	    	if(data_s != null){
	     		if(data_s.length() > 7 ){
	      			data_s = data_s.substring(0,4) 
	      					+"³â"
	      					+ data_s.substring(4,6) 
	      					+"¿ù"
	      					+ data_s.substring(6,8) +"ÀÏ "
	      					+ data_s.substring(8,10)+"½Ã"
	      					+ data_s.substring(10,12)+"ºÐ";
	      		}else{
	      			return "";  
	      		}
	      	}else{
	        	return "";  
	      	} 
	      	return data_s;  
	  	} 
	  	
}
