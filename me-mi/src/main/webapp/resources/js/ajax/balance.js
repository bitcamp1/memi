var balance = {};
balance.init = function(){
	$('#lnb_balance').click(function(e){
		e.preventDefault();
		$('#content').load(balance_page);
	});
};