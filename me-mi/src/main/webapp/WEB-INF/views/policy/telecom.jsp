<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file='../common/lib.jsp' %>
<table id='telecom'>
<tr>
<td>
<table id='telecom_list' class='table_style' style='margin:20px 0; width:500px;'>
		<thead>
		<tr >
			<th class='tab_col' style='width:50px;border-color: black;' >선택</th>
			<th class='tab_col'>통신사 (등록수량 : ${totRow2})</th>
		</tr>	
		</thead>
		 <c:if test="${totRow2 <=0}">
		<tbody>
		<tr>
		

		<tr >
		<td colspan='2'><span>등록된 통신사가 없습니다</span></td>
		</tr>

</tbody> </c:if>



		 <c:if test="${totRow2 >0}">
		<tbody>
		<tr>
		
		<c:forEach begin="0" end="${totRow2-1}" var="list" items="${list}">
			<tr>
				<td><input type='checkbox' name='telecom'></td>
				<td>${list.telecom}</td>
			</tr>
		</c:forEach>

</tbody>
</c:if>
</table>
</td>
 </tr>
</table>
	<%--   <%@ include file='../common/paging.jsp' %>   --%>

<script>

	$('#telecom_count').on('click',function(){
		$.ajax('telecom/get.do',{
			type:'POST',
			dataType:'json',
			data:{word:$('#telecom').val()},
			success:function(data){
				if(data.status=="SUCCESS"){
					
				}else{
					
				}
			}
		});
		
	});
	$('#color_detail').fancybox({
		helpers :{overlay:{locked : false}},
		href : '${home}/telecom/detail.do',
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



		
		$('#color_add_bt').fancybox({
			helpers :{overlay:{locked : false}},
			href : '${home}/telecom/add.do',
			'scrolling'		: 'no',
			'titleShow'		: false,
			'width'			: 600,
			'height'		: 300,
			'autoSize'		: false,
			'transitionIn'	: 'elastic',
			'transitionOut'	: 'elastic',
			'overlayShow'	: false,
			'type'          :'iframe'
		});
		

	
		
	
</script>