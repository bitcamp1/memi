<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="lib.jsp" %>
<link rel="stylesheet" href="${css}/lnb.css" type="text/css"/>
<script type="text/javascript">
<!--

	function loadPage(text){
		$('.content').load(text);
	}

//-->
</script>
<script src="${js}/ajax/cust.js"></script> 
<script src="${js}/ajax/statement.js"></script> 
<script src="${js}/ajax/balance.js"></script> 

<script type="text/javascript">
$(document).ready(function(){
	$(".over li").on("mouseenter focusin", function(){
		$(this).addClass("on");
	}).on("mouseleave focusout", function(){
		$(this).removeClass("on");
	});
});
</script>
<div class='content'>   
	<div id='lnb'>
	    <h2>관리메뉴</h2>
	    <ul class='lnb_nav s_list01 over'>
	        <li><strong>현황보고서</strong>
	        	<ul class="s_depth">
	        		<li><a href='#' id='lnb_statement'>입출금내역서</a></li>
	        		<li><a href='#' id='lnb_balance'>판매점정산내역서</a></li>
	        		<li><a href='#' id='lnb_cust'>월별개통내역</a></li>
	        	</ul>	        
	        </li>
	       <li>
	       		<strong>영업지원</strong>
	        	<ul class="s_depth">
	        		<li><a href='#' onclick="loadPage('${home}/srch/whole.do');">전체조회</a></li>
	        		<li><a href='#' onclick="loadPage('${home}/srch/goods.do');">재고조회</a></li>
	        		<li><a href='#' onclick="loadPage('${home}/srch/sale.do');">판매조회</a></li>
	        		<li><a href='#' onclick="loadPage('${home}/srch/cred.do');">신용조회</a></li>
	        	</ul>	        
	        </li>
	          <li><strong>데이터입력</strong>
	        	<ul class="s_depth">
	        		<li><a href='#' id='set_cust'>고객등록</a></li>
	        		<li><a href='#' onclick="loadPage('${home}/calc/whansoo.do');">환수환급</a></li>
	        		<li><a href='#' onclick="loadPage('${home}/calc/soonap.do');">요금수납</a></li>
	        		<li><a href='#' onclick="loadPage('${home}/calc/ipkum.do');">입출금</a></li>
	        		<li><a href='#' onclick="loadPage('${home}/calc/misoo.do');">미수금</a></li>
	        	</ul>
	        
	        </li>
	        <li><strong>재고관리</strong>
	        	<ul class="s_depth">
	        		<li><a href='#' onclick="loadPage('${home}/logis/jego.do');">재고</a></li>
	        		<li><a href='#' onclick="loadPage('${home}/logis/ipgo.do');">입고</a></li>
	        		<li><a href='#' onclick="loadPage('${home}/logis/chgo.do');">출고</a></li>
	        		<li><a href='#' onclick="loadPage('${home}/logis/hoisu.do');">회수</a></li>
	        		<li><a href='#' onclick="loadPage('${home}/logis/loss.do');">분실</a></li>
	        		<li><a href='#' onclick="loadPage('${home}/logis/back.do');">반품</a></li>
	        		<li><a href='#' onclick="loadPage('${home}/logis/paper.do');">명세서</a></li>
	        	</ul>
	        
	        </li>
	         <li><strong>관리자</strong>
	        	<ul class="s_depth">
	        		<li><a href='#' onclick="loadPage('${home}/mg/info.do');">기본정보관리</a></li>
	        		<li><a href='#' onclick="loadPage('${home}/mg/fee.do');">요금관리</a></li>
	        		<li><a href='#' onclick="loadPage('${home}/mg/mgid.do');">아이디관리</a></li>
	        		<li><a href='#' onclick="loadPage('${home}/mg/ipgocho.do');">입고처관리</a></li>
	        		<li><a href='#' onclick="loadPage('${home}/mg/panmecho.do');">판매처관리</a></li>
	        		<li><a href='#' onclick="loadPage('${home}/mg/qna.do');">내질문과답</a></li>
	        		<li><a href='#' onclick="loadPage('${home}/mg/req.do');">요구처리현황</a></li>
	        		<li><a href='#' onclick="loadPage('${home}/mg/tax.do');">세금계산서관리</a></li>
	        		<li><a href='#' onclick="loadPage('${home}/mg/price.do');">단말기출고가관리</a></li>
	        	</ul>
	        
	        </li>
	    </ul>
	</div>
</div>
<script>
var cust_set = '${home}/cust/set.do';
var cust_month = '${home}/cust/month.do';
var statement_list = '${home}/statement/list.do';
var balance_page = '${home}/balance/page.do';
cust.init();
statement.init();
balance.init();
</script>
