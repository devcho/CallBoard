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
			alert('ȸ�������� �Ϸ�Ǿ����ϴ�.');
		}else{
			alert('ȸ�����Կ� ������ �ֽ��ϴ�.');
		}
	}
</script>
</head>
<body onload="fnResult();">
</body>
</html>