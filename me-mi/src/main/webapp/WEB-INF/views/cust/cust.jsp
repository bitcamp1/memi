<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file='../common/lib.jsp' %>
<%@ include file='cust_bx.jsp' %> 


<div>
	<span style='font-weight: bold'>전체회원수 : ${totRow}</span>
	<span style='margin-left: 50px;font-weight: bold;'>현재 페이지 :${pageNo}/${totPage+1} </span>
	<span style='font-weight: bold;color:blue;float:right;'> ※ 성명을 클릭하면 상세페이지가 열립니다.</span>
</div>
<table id='cust_list' class='table_style' style='margin:20px 0;width:100%;'>
	<tr>
			<td colspan='9' style='text-align=right; border=#fff'>
			<form id="frm" name="frm" method="post" 
			action="${home}/cust/search.do" onsubmit="return chkSubmit(this);">
				
				</form>
			</td>
		</tr>
		<thead>
		<tr >
			<th class='tab_col' style='width:50px;' >번호</th>
			<th class='tab_col'style='width:150px;'>성명</th>
			<th class='tab_col'>전화번호</th>
			<th class='tab_col'>연락처번호</th>
			<th class='tab_col' >청구지주소</th>
			<!-- width가 작아서일단 주석처리<th class='tab_col'>이메일</th> -->
			<th class='tab_col'style='width:80px' >구분</th>
			<!-- <th class='tab_col' style='width:100px'>생년월일</th> -->
			<!--  <th class='tab_col' >등록일</th>  -->
			<th class='tab_col'style='width:50px'>성별</th>
			<!-- <th class='tab_col'style='width:70px'>편집</th> -->
		</tr>	
		</thead>
		<tbody>
		<tr>
		
		<c:forEach begin="0" end="${totRow}" var="list" items="${list}">
			<tr>
				<td>${list.cust_id }</td>
				<%-- <td>${list.cust_id}</td> --%>
				<td>
					<a href='${home}/cust/detail.do?id=${list.cust_id} class='pointer  fancybox' id='cust_detail' >
					 
						${list.cust_nm}
					</a>
				
				</td>
				<td>${list.phno }</td>
				<td>${list.telno }</td>
				<td>${list.addr}</td>
				<%-- <td>${list.eml }</td> --%>
				<td>${list.cust_gubun}</td>
				<%-- <td>${list.birth }</td> --%>
				<%-- <td>${list.regdt }</td> --%>
				 <td>
				 <c:if test="${list.gen =='0'}">법</c:if>
				 <c:if test="${list.gen =='1'}">남</c:if>
				 <c:if test="${list.gen =='2'}">여</c:if>
				 <c:if test="${list.gen =='3'}">남</c:if>
				 <c:if test="${list.gen =='4'}">여</c:if>
				 <c:if test="${list.gen =='6'}">외</c:if>
				</td>
		
				
				
				<%-- <td> 
					<a href='${home }/cust/detail.do?id=${list.cust_id}' 
					class='editBtn'>수정</a> 
					/ 
					<a href='${home }/cust/delete.do?id=${list.cust_id}' 
					class='delBtn'>삭제</a>
				</td> --%>
			</tr>
		</c:forEach>

</tbody>
</table>
<%@ include file='../common/paging.jsp' %> 

<script>

	$('#cust_detail').fancybox({
		helpers :{overlay:{locked : false}},
		href : '${home}/cust/detail.do',
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