<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
   

	

<table id='danga_bx' class="any_grd tp_list1">
  <tr style='height:20px;'>
    <td>단가관리</td>
    <td ><span class='blueFont' >  검색 </span></td>
    <td ><select name="sitem">
		            <option value="1">기간</option>
	            </select></td>
    <td ><input type="text" name="danga_srch" value="" class="input_text imea" size="25" onkeydown="if (event.keyCode == 13) {document.schFrm.submit();}"></td>
    <td ><input type="button" id='' class="cshand button06"  value=" 검 색 " ></td>
			
  </tr>
  <tr style='height:20px;'>
    <td> <input type='button' value='추가' class='pointer buttion06 fancybox' onClick='danga_add()'/></td>
    <td> <input type='button' value='수정' class='pointer buttion06 fancybox' onClick='danga_edt()'/></td>
    <td> <input type='button' value='삭제' class='pointer buttion06 fancybox' onClick='danga_del()'/></td>
    <td> <input type='button' value='미진행'/></td>
    <td> <input type='button' value='진행'/></td>
    <td> <input type='button' value='마감'/></td>
  </tr>

	
		<tr> 
			<td>ㅁ</td>
			<td>No</td>
			<td>통신사</td>
			<td>약정</td>
			<td>적용날짜</td>
			<td>단가명</td>
			<td>입고처</td>
			<td>수신처</td>
			<td>매장</td>
			<td>설정|조회|문자</td>
			<td>작성자</td>
		</tr>
	<c:forEach var='danga_grd' items='${danga_grd}'>
		<tr>	
			<td>${danga_grd.cstIdx}</td>
			<td><fmt:formatDate value="${list.cstAddDate }" pattern="yyyy-MM-dd"/></td>
			<td>${danga_grd.saleType}</td>
			<td>${danga_grd.shpNm}</td>
			<td>${danga_grd.cstNm}/ ${cstLst.cstTel}</td>
			<td>${danga_grd.cstSsn}</td>
			<td>${danga_grd.pdtModel}</td>
			<td>${danga_grd.pdtColor}</td>
			<td>${danga_grd.cstJoinType}</td>
			<td>${danga_grd.tffNm}</td>
			<td>${danga_grd.totPrice}</td>
			<td>${danga_grd.progStat}</td>
			<td>${danga_grd.openYn}</td>
			<td>${danga_grd.cancYn}</td>
			<td>${danga_grd.cia}</td>
		</tr>
	</c:forEach>

</table>
<c:if test="${currentPage != 1 }">
		<a href="${home}/customer/list.do?pageNo=${currentPage - 1}">[PREV]</a>
	</c:if>
	<c:forEach begin="1" end="${noOfPages }" var="i">
		<c:choose>
			<c:when test="${currentPage eq i }">
				${i}
			</c:when>
			<c:otherwise>
				<a href="${pageContext.request.contextPath }/customer/list.do?pageNo=${i}">${i }</a>
			</c:otherwise>
		</c:choose>
	</c:forEach>
	<c:if test="${currentPage lt noOfPages }">
		<a href="${pageContext.request.contextPath }/customer/list.do?pageNo=${currentPage+1}">[NEXT]</a>
	</c:if>
<script src="${js}/vw/danga.js"></script>
