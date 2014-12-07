<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<link rel="stylesheet" href="${css}/gnb.css" type="text/css"/>
<script type="text/javascript">
<!--
function loadPage2(text){
	$('.content').load(text);
}
$(function() {	
	
	$('#gnb li').click(function(){
		$('dl', this).slideToggle('fast' );
	});
	
	
});
//-->

</script>
<div>
    <ul id='gnb'>
	        <li class="menu1 pointer abc">공지/단가표
	        	<dl>
	        		
	        		<dd class='slid'><a href='#' onclick="loadPage2('${home}/board/danga.do');" >단가</a></dd>
	        		<dd><a href='#' onclick="loadPage2('${home}/board/gongji.do');">공지사항</a></dd>
	        		<dd><a href='#' onclick="loadPage2('${home}/board/gesi.do');">게시판</a></dd>
	        	</dl>
	        
	        </li>
	       <li class="menu2 pointer">조회
	        	<dl>
	        		
	        		<dd><a href='#' onclick="loadPage2('${home}/srch/whole.do');">전체조회</a></dd>
	        		<dd><a href='#' onclick="loadPage2('${home}/srch/goods.do');">재고조회</a></dd>
	        		<dd><a href='#' onclick="loadPage2('${home}/srch/sale.do');">판매조회</a></dd>
	        		<dd><a href='#' onclick="loadPage2('${home}/srch/cred.do');">신용조회</a></dd>
	        		<dd><a href='#' onclick="loadPage2('${home}/cust/list.do?page=1');">고객관리</a></dd>
	        	</dl>
	        
	        </li>
	        <li class="menu3 pointer">재고
	        	<dl>
	        		
	        		<dd><a href='#' onclick="loadPage2('${home}/logis/jego.do');">재고</a></dd>
	        		<dd><a href='#' onclick="loadPage2('${home}/logis/ipgo.do');">입고</a></dd>
	        		<dd><a href='#' onclick="loadPage2('${home}/logis/chgo.do');">출고</a></dd>
	        		<dd><a href='#' onclick="loadPage2('${home}/logis/hoisu.do');">회수</a></dd>
	        		<dd><a href='#' onclick="loadPage2('${home}/logis/loss.do');">분실</a></dd>
	        		<dd><a href='#' onclick="loadPage2('${home}/logis/back.do');">반품</a></dd>
	        		<dd><a href='#' onclick="loadPage2('${home}/logis/paper.do');">명세서</a></dd>
	        	</dl>
	        
	        </li>
	        <li class='menu4 pointer'> 판매
        		<dl>
        			<dd><a href='#' onclick="loadPage2('${home}/sale/open.do')">개통</a></dd>
        			<dd><a href='#' onclick="loadPage2('${home}/sale/gaopen.do')">가개통</a></dd>
        			<dd><a href='#' onclick="loadPage2('${home}/sale/gita.do')">기타판매</a></dd>
        			<dd><a href='#' onclick="loadPage2('${home}/sale/mibi.do')">미비판매</a></dd>
        			<dd><a href='#' onclick="loadPage2('${home}/sale/return.do')">반납판매</a></dd>
        			<dd><a href='#' onclick="loadPage2('${home}/sale/usim.do')">유심판매</a></dd>
        		</dl>
	        
	        </li>
	        
	        <li class="menu5 pointer">정산
	        	<dl>
	        	
	        		<dd><a href='#' onclick="loadPage2('${home}/cal/mycalc.do');">내정산</a></dd>
	        		<dd><a href='#' onclick="loadPage2('${home}/cal/whansoo.do');">환수환급</a></dd>
	        		<dd><a href='#' onclick="loadPage2('${home}/cal/soonap.do');">요금수납</a></dd>
	        		<dd><a href='#' onclick="loadPage2('${home}/cal/ipkum.do');">입출금</a></dd>
	        		<dd><a href='#' onclick="loadPage2('${home}/cal/misoo.do');">미수금</a></dd>
	        	</dl>
	        
	        </li>
	         <li class="menu7 pointer">정책
	        	<dl>
	        	
	        		<dd><a href='#' id='tariff'>요금제</a></dd>
	        		<dd><a href='#' id='telecom'>통신사</a></dd>
	        		<dd><a href='#' onclick="loadPage2('${home}/halbu/page.do');">할부</a></dd>
	        		<dd><a href='#' onclick="loadPage2('${home}/mgr/fee.do');">정책관리</a></dd>
	        	</dl>
	        
	        </li>
	            <li class="menu8 pointer">단말기
	        	<dl>
	        		<dd><a href='#' id='color'>컬러</a></dd>
	        		<dd><a href='#' id='dte'>모델</a></dd>
	        		<dd><a href='#' id='usim'>유심</a></dd>
	        		
	        	</dl>
	        
	        </li>
	         <li class="menu9 pointer">관리자
	        	<dl>
	        	
	        		<dd><a href='#' onclick="loadPage2('${home}/mgr/info.do');">기본정보관리</a></dd>
	        		<dd><a href='#' id='emp'>직원현황</a></dd>
	        		<dd><a href='#' id='shop'>매장관리</a></dd>
	        		<dd><a href='#' onclick="loadPage2('${home}/mgr/panmecho.do');">판매처관리</a></dd>
	        		<dd><a href='#' onclick="loadPage2('${home}/mgr/qna.do');">내질문과답</a></dd>
	        		<dd><a href='#' onclick="loadPage2('${home}/mgr/req.do');">요구처리현황</a></dd>
	        		<dd><a href='#' onclick="loadPage2('${home}/mgr/tax.do');">세금계산서관리</a></dd>
	        		<dd><a href='#' onclick="loadPage2('${home}/mgr/price.do');">단말기출고가관리</a></dd>
	        	</dl>
	        
	        </li>
	    </ul>
</div>
<div id='color_div'></div>
<script>
var colorUrl = '${home}/color/list.do';
var empUrl = '${home}/emp/list.do';
var shopUrl = '${home}/shop/list.do';
var tariffUrl = '${home}/tariff/list.do';
var telecomUrl = '${home}/telecom/list.do';
var usimUrl = '${home}/usim/list.do';
var dteUrl = '${home}/dte/list.do';
$('#dte').on('click',function(e){
	e.preventDefault();
	$('#content').empty();
	dte.getList();
});
$('#color').on('click',function(e){
	e.preventDefault();
	$('#content').empty();
	color.getList();
});
$('#emp').on('click',function(e){
	e.preventDefault();
	$('#content').empty();
	employee.getList();
});
$('#shop').on('click',function(e){
	e.preventDefault();
	$('#content').empty();
	shop.getList();
});
$('#tariff').on('click',function(e){
	
	e.preventDefault();
	$('#content').empty();
	
	tariff.getList();
});
$('#telecom').on('click',function(e){
	e.preventDefault();
	$('#content').empty();
	telecom.getList();
});
$('#usim').on('click',function(e){
	e.preventDefault();
	$('#content').empty();
	usim.getList();
});
</script>
