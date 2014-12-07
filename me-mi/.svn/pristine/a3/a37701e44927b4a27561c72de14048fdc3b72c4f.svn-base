function Employee(){
	this.getList=function(){
		$.getJSON(empUrl,function(data){
			var html = '<table id="emp_grid" class="table_style" style="margin:20px 0; width:500px;"><tr><td>ID</td><td>이름</td><td>직책</td><td>휴대전화</td><td>회사전화</td><td>직책</td><td>이메일</td><td>소속사</td></tr>';
			$.each(data.list,function(index,item){
				html += '<tr><td>'+item.empid+'</td>';
				html += '<td>'+item.empnm+'</td>';
				html += '<td>'+item.empduty+'</td>';
				html += '<td>'+item.phono+'</td>';
				html += '<td>'+item.telno+'</td>';
				html += '<td>'+item.empduty+'</td>';
				html += '<td>'+item.eml+'</td>';
				html += '<td>'+item.shpnm+'</td>';
				html += '</tr>';
			});
			html +='</table>';
			$('#content').append(html);
		});
		
	};
}
var employee = new Employee();