<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<link rel="stylesheet" href="/test/css/member.css">
</head>

<body>
	<div id="memreg" class="memreg">
	<h1>회원가입</h1>
		<table width="90%" border="0">
			 <tr height="10px">
			 	<td style="0px 0px 0px 0px;"></td>
			 </tr>
			 <tr>
				 <td>
						<form id="userreg" name="userreg" method="post" action="/CallBoard/user/reguser">
				        <table width="100%">
							<tr height="2" bgcolor="#FFC8C3"><td colspan="2"></td></tr>
				            <tr>
				                <th>이름</th>
				                <td><input type="text" id="Uname" name="Uname" /></td>
				            </tr>
				            <tr>
				                <th>아이디</th>
				                <td><input type="text" id="user_id" name="user_id" /></td>
				            </tr>
				            <tr>
				                <th>비밀번호</th>
				                <td><input type="password" id="user_pass" name="user_pass" /></td>
				            </tr>
				            <tr>
				                <th>비밀번호 확인</th>
				                <td><input type="password" id="user_pass2" name="user_pass2" /></td>
				            </tr>
				            <tr>
				                <th>이메일</th>
				                <td><input type="text" id="m_email" name="m_email" /></td>
				            </tr>
				            
				            
				            <tr>
				                <th>닉네임</th>
				                <td><input type="text" id="user_nickname" name="user_nickname" /></td>
				            </tr>
				            <tr height="2" bgcolor="#FFC8C3"><td colspan="2"></td></tr>
				        </table>
					    </form>
			    </td>
 		    <tr style="height:100px;">
 	            <td style="width:80%;text-align:center;">
	             	<button type="button" id="submitBtn" class="myButton">완료</button>&nbsp;
	             	<button type="button" id="cancelBtn" class="myButton">취소</button>
	            </td>
           </tr>
	    </table>
	</div>
	<div style="height:100px;">
	</div>
</body>
<script type="text/javascript">
<!--
	$("#submitBtn").click(function(){
		if($("#Uname").val() == ""){
			alert('이름을 입력하세요');
		}else if($("#user_id").val() == ""){
			alert('사용자아이디를 입력하세요'); 
		}else if($("#user_pass").val() == ""){
			alert('비밀번호를 입력하세요'); 
		}else if($("#user_pass2").val() == ""){
			alert('비밀번호확인을 입력하세요'); 
		}else if($("#user_nickname").val() == ""){
			alert('닉네임을 입력하세요'); 	
		}else{
			$('#userreg').submit();	
		}
		 
	});
//-->
</script>
</html>