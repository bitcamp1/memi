function Shop(){
	this.getList=function(){
		$.getJSON(shopUrl,function(data){
			var html = '<table id="shop_grid"class="table_style" style="margin:20px 0; width:1000px;">';
			html+='<tr><td>ID</td><td>상호</td><td>타입</td><td>주소</td><td>우편번호</td></tr>';
			$.each(data.list,function(index,item){
				html += '<tr><td>'+item.shopid+'</td>';
				html += '<td>'+item.shopnm+'</td>';
				html += '<td>'+item.shoptp+'</td>';
				html += '<td>'+item.juso+'</td>';
				html += '<td>'+item.zip+'</td></tr>';
			});
			html += '</table>';
			$('#content').append(html);
		});
	};
}
var shop = new Shop();