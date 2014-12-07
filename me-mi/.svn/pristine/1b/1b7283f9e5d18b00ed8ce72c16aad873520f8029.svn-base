<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<table>
	<tr>
		<td>
			<table width="582" border="0" cellspacing="0" cellpadding="0"
				id="resulttable">
			</table>
		</td>
	</tr>
	<tr>
</table>
<script type="text/javascript">
	jQuery.ajax({
		type : "POST",
		dataType : "json",
		data : {
			'type_gb' : type_gb,
			'sido' : sido,
			'sigungu' : sigungu,
			'nm' : nm,
			'mainno' : mainno,
			'subno' : subno
		},
		url : "/test/moon/zipcode_finder_newAjax.jsp",
		contentType : "application/x-www-form-urlencoded;charset=utf-8", //한글 깨짐 방지
		cache : false,
		success : function(data) {

			$("#resulttable").empty();
			$("#resulttable").append(menu);
			if (data.length > 0) {
				jQuery.each(data, function(i, re) {
					$("#resulttable").append(
							n1 + re.zipcode + n2 + re.newaddr + n3 + re.oldaddr
									+ n4);
				});
			} else {
				$("#resulttable").append(nosearch);
			}

		}
	});
</script>
<!-- === 액션페이지 === -->

<!-- 
당 변수를 넘겨 ajax 액션페이지에서 처리후 해당 리스트를 받음 (json)
리스트 사이즈가 0보다크면 반복하면서 결과값을 append함. 다시호출시 일단 empty로 지우고 다시뿌림 -->