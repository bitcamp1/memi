<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../common/lib.jsp" %>

<p>9월 SK텔레콤, 판매점 정산내역서</p>
<table class='table_style' style='border:1px solid black;width:1050px;'>
	<tr>
		<th rowspan=2>구분</th>
		<th colspan=2>매출</th>
		<th colspan=2>매입</th>
		<th rowspan=2></th>
	</tr>
	<tr>
		<th>할부원금</th>
		<th>SKT 수수료외</th>
		<th>SKN</th>
		<th>판매수수료</th>
	</tr>
	<tr>
		<td>11월</td>
		<td></td>
		<td></td>
		<td></td>
		<td></td>
		<td></td>
	</tr>
</table>
<table class='table_style' style='border:1px solid black;width:1050px;margin:10px 0 10px 0;'>
  <tr>
		<th>
			대리점명
		</th>
		<th>
			개통수
		</th>
		<th>
			할부원금
		</th>
		<th>
			리베이트정책
		</th>
		<th>
			정책차감액
		</th>
		<th>
			판매수수료
		</th>
		<th>
			공제금액
		</th>
		<th>
			지급액
		</th>
		<th>
			비고
		</th>
	</tr>
	<c:forEach begin="0" end="${totRow}" var="list" items="${list}">
	<tr>
			<td>
				${list.shopName}
			</td>
			<td>
				${list.openCount}
			</td>
			<td>
				${list.chulgoWon}
			</td>
			<td>
				${list.halbuWon}
			</td>		
			<td>
				${list.rebateWon}
			</td>
			<td>
				${list.chagamWon}
			</td>
			<td>
				${list.salesFee}
			</td>
			<td>
				${list.gongjeWon}
			</td>
			<td>
				${list.jigupWon}
			</td>
			<td>
				${list.bigo}
			</td>
	</tr>
	</c:forEach>
	<tr>
		<td>
			<p>합계</p>
		</td>
		<td>
		</td>
		<td>
			
		</td>
		<td>
			
		</td>
		<td>
			
		</td>
		<td>
			
		</td>
		<td>
			
		</td>
		<td>
			
		</td>
		<td>
			
		</td>
	</tr>
</table>
	
<script>
	var balance_list = '${home}/balance/list.do';
	balance.init();
	
</script>


