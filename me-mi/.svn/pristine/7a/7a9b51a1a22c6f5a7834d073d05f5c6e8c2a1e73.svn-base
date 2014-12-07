<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file='../common/lib.jsp'%>

<div>
	<input type='button' value='모델' id='model_btn' />
</div>
<table id='model_grid' style='margin: 20px 0; width: 500px;'>


</table>
<script>
	$('#model_grid').on('click',function(e){
		$('#model_grid').empty();
		e.preventDefault();
		$.ajax('${home}/model/list.do',{
			type:'GET',
			dataType:'json',
			data:{},
			success:function(data){
				if(data.status=='SUCCESS'){
					var html = '<table class='table_style'><tr><td>단말기 모델</td></tr>';
					$.each(data.list, function(index, item){
						html += '<tr>'+item.model+'</tr>';
						html += '</tr>';
						return false;
					});						
					html += '</table>';
					$('#model_grid').append(html);
					
				}else if(data.status='FAIL'){
					alert(data.list+'가 없습니다.');
				}else{
						alert('등록실패입니다.');
				}
				},
				error:function(x,o,e){
					alert(x.stauts+":"+o+":"+e);
				}
		});
	});
	
</script>