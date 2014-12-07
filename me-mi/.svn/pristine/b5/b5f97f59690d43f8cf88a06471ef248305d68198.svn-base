<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file='../common/lib.jsp' %>
<table>
<tr style='border:1px solid black;'>
<td style='font-weight: bold; text-align: center;width:500px;'>
	<span >컬러 등록</span>
	</td>
</tr>
<tr style='border:1px solid black;'>
	<td style='border:1px solid black;'>
		<input type='text'id='col_add_val' name='col_add_val' style='width:200px; height:25px;'/>
		<input type='button'value='등록' class='btn_sty'id='col_add_btn_2'style='width:150px;'/>
		
	</td>
</tr>
</table>


<script>
$(function(){
	$('#col_add_btn_2').click(function(){

				$.ajax('add2.do', {
					type: 'POST',
					 dataType: 'json',
					data: {
						color: $('#col_add_val').val()
						
					}
				
				,
					success: function(data) {
						 if (data.status=="FAIL") {
							 window.alert('등록된 색상입니다');
						}else if (data.status=="SUCCESS"){
							window.alert(data.color+'이 등록되었습니다.');
						}else{
							window.alert('등록실패입니다.');
						}
						
						
					},
					error: function(x,o,e) {
						
						alert(x.stauts+":"+o+":"+e);
					}
				});
	});});
</script>