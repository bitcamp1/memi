<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
 		<link rel="stylesheet" href="http://code.jquery.com/ui/1.10.2/themes/smoothness/jquery-ui.css" />
        <script src="http://code.jquery.com/jquery-1.9.1.min.js"></script>
        <script src="http://code.jquery.com/ui/1.10.2/jquery-ui.js"></script>
            <div id='content'>
            </div>
  

    <script>
  
     $(function(){
          $('#content').load('${home}/sign.do');
     }); 
    </script>