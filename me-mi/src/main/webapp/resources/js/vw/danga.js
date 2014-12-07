
function danga_edt(){
	
	
		alert('success!!');
	
}
function fancybx(){
		
		
		$('#danga_edt_bt').fancybox({
			helpers :{overlay:{locked : false}},
			href : '',// ${home}/danga/update.do
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
}
		
