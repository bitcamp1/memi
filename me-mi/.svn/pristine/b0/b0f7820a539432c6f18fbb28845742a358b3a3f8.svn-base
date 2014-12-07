function Usim(){
	this.getList=function(){
		$.getJSON(usimUrl,function(data){
			var html = '<table id="usim_grid" class="table_style" style="margin:20px 0; width:800px;"><tr>';
			html +='<tr><th>유심번호</th><th>모델</th><th>유심비</th><th>지불타입</th><th>고객NO</th></tr>';
			$.each(data.list,function(index,item){
				html += '<tr><td>'+item.usimno+'</td><td>'+item.usimmdl+'</td><td>'+item.usimwon+'</td>';
				html += '<td>'+item.usimpaytm+'</td><td>'+item.custid+'</td></tr>';
			});
			html += '</table>';
			$('#content').append(html);
			
		});
	};
}
var usim = new Usim();