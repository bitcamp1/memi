<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file='../common/lib.jsp' %>
<style>
#sign { position:absolute; top:50%; left:50%; width:300px; height:200px;  margin-top:-150px; margin-left:-100px;}
</style>
<div id='sign' >
       <table style='width:395px;'>
         <tr> 
           <td width="97" height="35">
               <img src='${img}/sign_on/lb_login_u.gif' width="91" height="25"/>

           </td>
           <td width="202" valign="top"> 
               <input id ="uid" name="uid" type="text" size="31" style='height:29px;'> 
           </td>
           <td width="96" rowspan="2">
               <div align="center" id='bt_login'>
                   <img src='${img}/sign_on/bt_login.gif' width="88" height="67" alt="로그인버튼" 
                   style='cursor:pointer'>
					
              </div>
           </td>
         </tr>
         <tr> 
           <td height="35">
               <img src='${img}/sign_on/lb_login_d.gif' width="91" height="29">

           </td>
           <td>
               <input id="pwd" name="pwd" type="password" size="31"style='height:29px;'>
           </td>
         </tr>
       </table>
</div>
   <script>
   $(function(){
	
	   $('#bt_login').click(function(){
			$.ajax('login.do', {
				type: 'POST',
				 dataType: 'json',
				data: {
					uid: $('#uid').val(),
					pwd: $('#pwd').val(),
				}
			,
				success: function(data) {
					 if (data.status=="FAIL") {
						 window.alert('사용자 아이디 또는 암호가 일치하지 않습니다!');
					}else if (data.status=="SUCCESS"){
						location.href='${home}/go.do';
					}else{
						window.alert('사용자 아이디 또는 암호가 잘못되었습니다.');
					}
					
					
				},
				error: function(x,o,e) {
					
					alert(x.stauts+":"+o+":"+e);
				}
			});
		});
   });
   </script>