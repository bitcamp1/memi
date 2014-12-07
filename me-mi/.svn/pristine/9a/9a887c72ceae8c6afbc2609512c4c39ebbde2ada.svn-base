<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file='../common/lib.jsp' %>
<style>
	#color_u{width:100%; height:100px;}
	#color_u tr td{border:1px solid red;}
	
</style>    
<!-- <div><input type='button' value='색상' id='color_btn'/></div> -->

<table id='color_tbl'>
	 <tr>
			<td colspan='2' style='text-align=right; border=#fff'>
			<form id="frm" name="frm" method="post" 
			action="${home}/color/search.do" onsubmit="return chkSubmit(this);">
				
				</form> 
				
			</td>
		</tr>
		<thead>
		<tr >
			<th class='tab_col' style='width:50px;border-color: black;' >선택</th>
			<th class='tab_col'>색상 (등록수량 : ${totRow})</th>
		</tr>	
		</thead>
		 <c:if test="${totRow <=0}">
		<tbody>
		<tr>
		

		<tr >
		<td colspan='2'><span>등록된 색상 이 없습니다</span></td>
		</tr>

</tbody> </c:if>



		 <c:if test="${totRow >0}">
		<tbody>
		<tr>
		
		<c:forEach begin="0" end="${totRow-1}" var="list" items="${list}">
			<tr>
				<td><input type='checkbox' name='color'></td>
				<td>${list.color}</td>
			</tr>
		</c:forEach>

</tbody>
</c:if>
</table>

	<%--   <%@ include file='../common/paging.jsp' %>   --%>

<script>
$.getJSON('${home}/color/list.do',{
	type:'GET',
	dataType:'json',
	data:{},
	success:function(data){
		console.log('AJAX DATA Total Row:'+data.list);
		console.log('Data item:'+data.item);
		if(data.status=='SUCCESS'){
			var html = '<table id="color_grid" class="table_style" style="margin:20px 0; width:500px;"><tr><td>단말기색상</td></tr>';
			$.each(data.list, function(index,item){
				html += '<tr><td>'+item.color+'</td>';
				html += '</tr>';
				//return false;
			});
			html +='</table>';
			$('#color_div').append(html);
		}else if(data.status=='FAIL'){
			alert(data.list+'가 없습니다.');
		}else{
			alert('등록실패입니다.');
		}
	},
	error : function(x,o,e) {
		
		alert("Error ==>"+x.stauts+":"+o+":"+e);
	}
});
$('#color_btn').on('',function(e){
	$('#color_grid').empty();
	e.preventDefault();
	$.ajax('${home}/color/list.do',{
		type:'GET',
		dataType:'json',
		data:{},
		success:function(data){
			console.log('AJAX DATA Total Row:'+data.list);
			console.log('Data item:'+data.item);
			if(data.status=='SUCCESS'){
				var html = '<table id="color_grid" class="table_style" style="margin:20px 0; width:500px;"><tr><td>단말기색상</td></tr>';
				$.each(data.list, function(index,item){
					html += '<tr><td>'+item.color+'</td>';
					html += '</tr>';
					//return false;
				});
				html +='</table>';
				$('#color_div').append(html);
			}else if(data.status=='FAIL'){
				alert(data.list+'가 없습니다.');
			}else{
				alert('등록실패입니다.');
			}
		},
		error : function(x,o,e) {
			
			alert("Error ==>"+x.stauts+":"+o+":"+e);
		}
	
	});
});
	
	$('#color_detail').fancybox({
		helpers :{overlay:{locked : false}},
		href : '${home}/color/detail.do',
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
			href : '${home}/color/add.do',
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