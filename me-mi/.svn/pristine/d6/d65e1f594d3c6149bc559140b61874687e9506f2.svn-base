function Telecom(){
	this.getList=function(){
		$.getJSON(telecomUrl,function(data){
			var html = '<table id="telecom_grid" class="table_style" style="margin:20px 0; width:1000px;">';
			html +='<tr><td>통신사</td></tr>';
			$.each(data.list,function(index,item){
				html += '<tr><td>'+item.telecom+'</td></tr>';
			});
			html += '</table>';
			$('#content').append(html);
		});
	};
}
var telecom = new Telecom();