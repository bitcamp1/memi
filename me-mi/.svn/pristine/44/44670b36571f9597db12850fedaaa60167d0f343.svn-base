<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file='../common/lib.jsp' %>

<div id='tariff_grid'>
	정책
 <input type=button value='버튼' id='selec_tf'/>
</div>
<script>

$('#selec_tf').on('click',function(event){
	 $('#tariff_grid').empty();
	 event.preventDefault(); 
	 $.ajax('${home}/tariff/list.do',{
		 type: 'GET',
		 dataType: 'json',
		data: {}
	
	,
		success: function(data) {
			console.log('ajax는 갔다왔다'+data.list.length);
			 if (data.status=="SUCCESS") {
				 var table = "<table  border='1'><tr><td>요금제</td><td>통신사</td></tr>";
                 $.each(data.list, function (index,item){
					 table += '<tr>';
	                    table += '<td>' + item["tariff"] + '</td>';
	                    table += '<td>' + item["telecom"] + '</td>'; 
	                    table += '</tr>';
	                    return false;
				 });
				  table += "</table>";
				  $('#tariff_grid').append(table);
			}else if (data.status=="FAIL"){
				window.alert(data.list+'가 없습니다');
			}else{
				window.alert('등록실패입니다.');
			}
			
			
		},
		error: function(x,o,e) {
			
			alert(x.stauts+":"+o+":"+e);
		}
	 });
	 event.stopImmediatePropagation();
});

</script>