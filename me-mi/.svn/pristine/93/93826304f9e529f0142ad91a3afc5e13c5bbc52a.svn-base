function Tariff(){
	
	this.getList=function(){
		$.getJSON(tariffUrl,function(data){
			var html = '<table id="tariff_grid" class="table_style" style="margin:20px 0; width:1000px;">';
			html += '<tr><td>요금제</td><td>통신사</td></tr>';
			$.each(data.list,function(index,item){
				html += '<tr><td>'+item.tariff+'</td>';
				html += '<td>'+item.telecom+'</td></tr>';
			});
			html += '</table>';
			$('#content').append(html);
		});
	};
}

var tariff = new Tariff();