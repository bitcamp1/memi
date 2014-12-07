function Dte(){
	this.getList = function(){
		$.getJSON(dteUrl,function(data){
			var html = '<table id="color_grid" class="table_style" style="margin:20px 0; width:500px;"><tr>';
				html+='<th>모델명</th><th>가격</th><th>제조사</th><th>닉네임</th><th>통신사</th></tr>';
			$.each(data.list,function(index,item){
				html+='<tr><td>'+item.model+'</td>';
				html+='<td>'+item.price+'</td>';
				html+='<td>'+item.maker+'</td>';
				html+='<td>'+item.name+'</td>';
				html+='<td>'+item.telecom+'</td></tr>';
			});
			html += '</table>';
			$('#content').append(html);
		});
	};
}
var dte = new Dte();
