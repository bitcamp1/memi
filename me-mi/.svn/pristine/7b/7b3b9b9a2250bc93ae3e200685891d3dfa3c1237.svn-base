<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<style>
	#cust_u{width:100%; height:100px;}
	#cust_u tr td{border:1px solid red;}
	
</style>    

<table id='cust_bx'>
  <tr>
    <td class='blueFont' style='font-weight: bold;font-size: 20px;text-shadow:black;text-align:center;'>고객관리</td>
    <td style='width:20px;'></td>
    <td style='height:30px;'>
    		
			    <select name="sitem"  style='width:150px; height:30px;'>
		            <option value="1">고객ID</option>
		            <option value="2">고객명</option>
	            </select>
            <input type="text" name="stext" value="" style='width:200px; height:25px;'class="input_text imea" size="25" onkeydown="if (event.keyCode == 13) {document.schFrm.submit();}">
            <input type="button" id='' class="btn_sty pointer buttion06"  value=" 검 색 " >
            <input class='btn_sty' type='button' value='등록' class='pointer buttion06 fancybox' id='cust_add_bt' />
    <input class='btn_sty' type='button' value='수정' class='pointer buttion06 fancybox' />
    <input class='btn_sty' type='button' value='삭제'/>
    <input class='btn_sty' type='button' value='인쇄'/>
  <!-- 나중에 구현  <input class='btn_sty' type='button' value='엑셀저장'/> -->
    
		
     </td>
  </tr>
  <tr>
    <td colspan="2">
   
    </td>
  </tr>
</table>
 
<div id='customerSrchform'>
		
</div>
<script>


		
		$('#cust_add_bt').fancybox({
			helpers :{overlay:{locked : false}},
			href : '${home}/cust/add.do',
			'scrolling'		: 'no',
			'titleShow'		: false,
			'width'			: 1200,
			'height'		: 700,
			'autoSize'		: false,
			'transitionIn'	: 'elastic',
			'transitionOut'	: 'elastic',
			'overlayShow'	: false,
			'type'          :'iframe'
		});
	
		

	
		
	
</script>