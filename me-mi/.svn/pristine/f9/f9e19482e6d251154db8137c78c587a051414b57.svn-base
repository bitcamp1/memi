<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

 <div style='text-align:center;'>

	<c:if test ="${nowBlock == 1}">
		
	</c:if>
	<c:if test ="${nowBlock > 1}">
		<a href='#' onclick="loadPage2('${home }/${item}/list.do?page=${nowBlock*10-10}');">PREV</a><%--10 은 PAGES_PER_BLOCK --%>
	</c:if>

		<%--<c:forEach begin="${offset}" end="${limit-1 }" var="i" step="1">--%>
	<c:forEach begin="${startPage-1}" end="${endPage-1}" var="i" step="1">
		<c:if test="${i >= 0 }">
			<c:choose>
				<c:when test="${pageNo eq i+1 }">
					 [${i+1}] 
				</c:when>
				<c:otherwise>
					<a href='#' onclick="loadPage2('${home }/${item}/list.do?page=${i+1}');">[${i+1}]</a>
				</c:otherwise>
			</c:choose>
		</c:if>
		 <c:if test="${i+1}> ${pagesPerBlock}"><%--10 은 PAGES_PER_BLOCK --%>
			<c:choose>
				<c:when test="${pageNo eq i+1 }">
					[${i+1}]
				</c:when>
				<c:otherwise>
					<a href='#' onclick="loadPage2('${home }/${item}/list.do?page=${i}');">[${i+1}]</a>
				</c:otherwise>
			</c:choose>
		</c:if>
	</c:forEach> 

		<a href='#' onclick="loadPage2('${home }/${item}/list.do?page=${nowBlock*10+10}');">NEXT</a> <%--10 은 PAGES_PER_BLOCK --%>
			 <c:if test="${endBlock lt totPage }">
	</c:if>
	<%-- <a href='#' onclick="loadPage2('${home }/cust/list.do?page=${nowPageNo+pagesPerBlock}');">[맨끝]</a> --%>
	<%-- <c:if test="${nowPageNo lt totPage }">
		<a href='#' onclick="loadPage2('${home }/cust/list.do?page=${nowPageNo+pagesPerBlock}');">[이후][맨끝]</a>
	</c:if> --%>
	</div>
<script>
function loadPage2(text){
	$('.content').load(text);
}

</script>