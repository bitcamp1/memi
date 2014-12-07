<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file='../common/lib.jsp' %>
<style>
	#usim_u{width:100%; height:100px;}
	#usim_u tr td{border:1px solid red;}
	
</style>    

<table id='usim'>
  <tr>
    <td class='blueFont' style='font-weight: bold;font-size: 20px;text-shadow:black;text-align:center;'>USIM관리</td>
    <td style='width:20px;'></td>
    <td style='height:30px;'>
    		
			    <select name="sitem"  style='width:150px; height:30px;'>
		            <option value="1">USIM번호</option>
		            <option value="2">고객명</option>
	            </select>
            <input type="text" name="stext" value="" style='width:200px; height:25px;'class="input_text imea" size="25" onkeydown="if (event.keyCode == 13) {document.schFrm.submit();}">
            <input type="button" id='' class="btn_sty pointer buttion06"  value=" 검 색 " >
            <input class='btn_sty' type='button' value='등록' class='pointer buttion06 fancybox' id='usim_add_bt' />
    <input class='btn_sty' type='button' value='수정' class='pointer buttion06 fancybox' />
    <input class='btn_sty' type='button' value='삭제'/>
    <input class='btn_sty' type='button' value='인쇄'/>
    <input class='btn_sty' type='button' value='엑셀저장'/>
    
		
     </td>
  </tr>
  <tr>
    <td colspan="2">
   
    </td>
  </tr>
</table>
 
<div id='usimomerSrchform'>
		
</div>


	 <div>
	<span style='font-weight: bold'>전체USIM수 : ${totRow}
	
	
	</span>
	<span style='margin-left: 50px;font-weight: bold;'>현재 페이지 :${pageNo}/${totPage+1} </span>
</div>
<table id='usim_list' class='table_style' style='margin:20px 0;'>
	<tr>
			<td colspan='6' style='text-align=right; border=#fff'>
			<form id="frm" name="frm" method="post" 
			action="${home}/usim/search.do" onsubmit="return chkSubmit(this);">
				
				</form>
			</td>
		</tr>
		<thead>
		<tr >
			<th class='tab_col' style='width:50px;' >No</th>
			<th class='tab_col'style='width:150px;'>모델명</th>
			<th class='tab_col'>고객명</th>
			<th class='tab_col'>가격</th>
			<th class='tab_col' >지불방법</th>
			<th class='tab_col' >수정/삭제</th>
		</tr>	
		</thead>
		 <c:if test="${totRow <=0}">
		<tbody>
		<tr>
		

		<tr >
		<td colspan='6'><span>등록된 USIM 이 없습니다</span></td>
		</tr>

</tbody> </c:if>



		 <c:if test="${totRow >0}">
		<tbody>
		<tr>
		
		<c:forEach begin="0" end="${totRow}" var="list" items="${list}">
			<tr>
				<td>${list.usim_id }</td>
				<td>${list.usim_no}</td>
				<td>${list.usim_mdl }</td>
				<td>${list.cust_nm }</td>
				<td>${list.usim_won}</td>
				<td>${list.pay_type }</td>
				
			 <td> 
					<a href='${home }/usim/detail.do?id=${list.usim_id}' 
					class='editBtn'>수정</a> 
					/ 
					<a href='${home }/usim/delete.do?id=${list.usim_id}' 
					class='delBtn'>삭제</a>
				</td> 
			</tr>
		</c:forEach>

</tbody>
</c:if>
</table>

 

	<%-- <%@ include file='../common/paging.jsp' %>  --%>

<script>

	$('#usim_detail').fancybox({
		helpers :{overlay:{locked : false}},
		href : '${home}/usim/detail.do',
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



		
		$('#usim_add_bt').fancybox({
			helpers :{overlay:{locked : false}},
			href : '${home}/usim/add.do',
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