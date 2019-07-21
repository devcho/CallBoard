<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript">
	function fnResult(){
		<%
			String result = request.getAttribute("resultReg").toString();
		%>
		var result = <%=result%>;

		if(result == 1){
			alert('회원가입이 완료되었습니다.');
		}else{
			alert('회원가입에 문제가 있습니다.');
		}
	}
</script>
</head>
<body onload="fnResult();">
</body>
</html>