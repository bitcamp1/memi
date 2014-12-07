<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>매미!!!</title>
    	<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<style>
						body {
			  padding-top: 50px;
			  padding-bottom: 20px;
			}
		</style>
		<%@ include file='lib.jsp' %>
		<link href="${css}/bootstrap-responsive.css" rel="stylesheet">
		
    </head>
    
    <body >
   
    <div id='wrap'>
    <div class="navbar navbar-inverse navbar-fixed-top">
      <div class="navbar-inner">
       
           <%@ include file="menu.jsp" %>
           <%@ include file="gnb.jsp" %>
       
      </div>
    </div>
	 <div id='lnb'  style='float:left;margin:50px 0  0 0;'>
		 		<%@ include file="lnb.jsp" %>
		 	</div>
	 <div class='container' style='margin:50px auto;padding:50px 0;'>
		 	
		 	<div id='content' style='float:right;'>
				
		 	</div>
 	</div> <!-- container -->

   <div id='foot'>
        <%--    <img src='${img}/foot.png' /> --%>
           <div id="footer">
               <span id='foot_span' class='foot'>
                  copyright
               </span>
               <span id='foot_info' class='foot'>
                  
               </span>
           </div>
           <span></span>
       </div>   
       </div> <!-- wrap -->
<script>
	$(function(){
		$('#content').load('${home}/cust/month.do');
	});
</script>
   
</body>
</html>

