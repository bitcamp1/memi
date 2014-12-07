function Color(){
	this.getList = function(){
		$.getJSON(colorUrl,function(data){
			
				var html = '<table id="color_grid" class="table_style" style="margin:20px 0; width:500px;"><tr><td>단말기색상</td></tr>';
				$.each(data.list, function(index,item){
					html += '<tr><td>'+item.color+'</td></tr>';
				});
				html +='</table>';
				$('#content').append(html);
			
		});
	};
}
var color = new Color();
	