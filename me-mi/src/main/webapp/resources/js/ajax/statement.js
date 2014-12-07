var statement = {};
statement.init = function(){
	$('#lnb_statement').click(function(){
		$('#content').load(statement_list);
	});
};