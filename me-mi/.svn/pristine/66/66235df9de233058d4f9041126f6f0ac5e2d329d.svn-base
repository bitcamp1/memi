<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file='../common/lib.jsp' %>


<table >
  <tr>
    <td class='blueFont' style='font-weight: bold;font-size: 20px;text-shadow:black;text-align:center;'>단말기 옵션</td>
    <td style='width:20px;'></td>
    <td style='height:30px;'>
    			<div>
			     <select style='width:150px; height:30px;' id='selec_op'>
		            <option value="col" selected='selected'>단말기색상</option>
		            <option value="tel">통신사</option>
		            <option value="tf">요금제</option>
	            </select>
	            </div>
	            <div class='selec_div selec_col'>
	            	 <input type="text"  value="" id="stext" name="stext" style='width:200px; height:25px;'class="input_text imea" size="25" onkeydown="if (event.keyCode == 13) {document.schFrm.submit();}">
		            <input type="button" id='col_srch_bt' class="btn_sty pointer buttion06"  value=" 검 색 " >
		            <input type='button'  value='등록' id='color_add_bt'  class='btn_sty pointer buttion06 fancybox' />
				    <input type='button' class='btn_sty'  value='수정' class='pointer buttion06 fancybox' />
				    <input type='button' class='btn_sty'  value='삭제'/>
				    <input type='button' class='btn_sty'  value='인쇄'/>
				    <input type='button' class='btn_sty'  value='엑셀저장'/>
	            </div>
	             <div class='selec_div selec_tel'>
	            	<input type="text" name="stext" value="" style='width:200px; height:25px;'class="input_text imea" size="25" onkeydown="if (event.keyCode == 13) {document.schFrm.submit();}">
		            <input type="button" value=" 검 색 "   class="btn_sty pointer buttion06"  >
		            <input class='btn_sty' type='button' value='등록' id='tel_add_bt' class='pointer buttion06 '/>
				    <input class='btn_sty' type='button' value='수정' class='pointer buttion06 ' />
				    <input class='btn_sty' type='button' value='삭제'/>
				    <input class='btn_sty' type='button' value='인쇄'/>
				    <input class='btn_sty' type='button' value='엑셀저장'/>
	            </div> 
           	   <div class='selec_div selec_tf'>
	            	<input type="text" name="stext" value="" style='width:200px; height:25px;'class="input_text imea" size="25" onkeydown="if (event.keyCode == 13) {document.schFrm.submit();}">
		            <input type="button" value=" 검 색 "   class="btn_sty pointer buttion06"  >
		            <input class='btn_sty' type='button' value='등록' id='tel_add_bt' class='pointer buttion06 '/>
				    <input class='btn_sty' type='button' value='수정' class='pointer buttion06 ' />
				    <input class='btn_sty' type='button' value='삭제'/>
				    <input class='btn_sty' type='button' value='인쇄'/>
				    <input class='btn_sty' type='button' value='엑셀저장'/>
	            </div> 
		 

		</td>
  </tr>
  <tr>
    <td colspan="3">
   
    </td>
    
  </tr>
</table>


<table>
<tr>
	<td id='dte_op'  colspan="3" >
		<div class='selec_div selec_col op_table' style='margin:20px auto;width:600px;'>
			<%@ include file='color.jsp' %>	
		</div>
		<%-- <div id='' class='selec_div selec_tel op_table' style='margin:20px auto;width:600px;'>	
			<%@ include file='telecom.jsp' %>	
		</div> 
		<div id='tariff_grid' class='selec_div selec_tf op_table' style='margin:20px auto;width:600px;'>
			<%@ include file='tariff.jsp' %>	
		</div> --%>
		
	</td>
 </tr>
</table>
	


<script>
        

	$(function(){
		$('.selec_tel').hide();
		$('.selec_tf').hide();
		$('#selec_op').bind('change',function(){
			$('.selec_div').hide();
			$('.selec_'+$(this).val()).show();
			$('#selec_'+$(this).val()).trigger('click');
		});
	});	
	
		$('#color_add_bt').click(function(){
			$('#color_add_div').show();
		});
		$('#col_srch_bt').click(function(){
			$.ajax('color/srch.do',{
				type:'POST',
				dataType : 'json',
				data:{
					stext:$('#stext').val()
				},
				success:function(data){
					 if (data.status=="SUCCESS") {
						 $(".op_table").empty();
						 var selectedColor = $('.selectedColor');
						$('div').addClass('table_style').appendTo(selectedColor);
						$('span').addClass('table_style').text(data.color).appendTo(selectedColor);
						 /* append(function(idx){
								var item = color[idx];
								var output = '';
								output += "<table id='color_list' class='table_style' style='margin:20px 0; width:500px;'>";
								output += "<tr><td>"+item.color+"</td></tr></table>";
							});
						  $("#op_table")
						   .append("<table id='color_list' class='table_style' style='margin:20px 0; width:500px;'>")
						   .append("<thead>")
						   .append("<tr >")
						   .append("<th class='tab_col' style='width:50px;border-color: black;' >선택</th>")
						   .append("<th class='tab_col'>색상 (등록수량 : 1)</th>")
						   .append("</tr>")
						   .append("</thead>")
						   .append("<tbody>")
						   .append("<tr>")
						   .append("<td><input type='checkbox' name='color'></td>")
						   .append("<td>${"+data.color+"}</td>")
						   .append("</tr>")
						   .append("</tbody>")
						   .append("</table>")
						   .append("</div>"); */
						  

					}else if (data.status=="FAIL"){
						window.alert('등록된 색상이 아닙니다.');
					}else{
						window.alert('등록실패입니다.');
					}
				},
				error: function(x,o,e) {
					
					alert(x.stauts+":"+o+":"+e);
				}
			});
		});
		
	
</script>