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
	<h1>ȸ������</h1>
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
				                <th>�̸�</th>
				                <td><input type="text" id="Uname" name="Uname" /></td>
				            </tr>
				            <tr>
				                <th>���̵�</th>
				                <td><input type="text" id="user_id" name="user_id" /></td>
				            </tr>
				            <tr>
				                <th>��й�ȣ</th>
				                <td><input type="password" id="user_pass" name="user_pass" /></td>
				            </tr>
				            <tr>
				                <th>��й�ȣ Ȯ��</th>
				                <td><input type="password" id="user_pass2" name="user_pass2" /></td>
				            </tr>
				            <tr>
				                <th>�̸���</th>
				                <td><input type="text" id="m_email" name="m_email" /></td>
				            </tr>
				            
				            
				            <tr>
				                <th>�г���</th>
				                <td><input type="text" id="user_nickname" name="user_nickname" /></td>
				            </tr>
				            <tr height="2" bgcolor="#FFC8C3"><td colspan="2"></td></tr>
				        </table>
					    </form>
			    </td>
 		    <tr style="height:100px;">
 	            <td style="width:80%;text-align:center;">
	             	<button type="button" id="submitBtn" class="myButton">�Ϸ�</button>&nbsp;
	             	<button type="button" id="cancelBtn" class="myButton">���</button>
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
			alert('�̸��� �Է��ϼ���');
		}else if($("#user_id").val() == ""){
			alert('����ھ��̵� �Է��ϼ���'); 
		}else if($("#user_pass").val() == ""){
			alert('��й�ȣ�� �Է��ϼ���'); 
		}else if($("#user_pass2").val() == ""){
			alert('��й�ȣȮ���� �Է��ϼ���'); 
		}else if($("#user_nickname").val() == ""){
			alert('�г����� �Է��ϼ���'); 	
		}else{
			$('#userreg').submit();	
		}
		 
	});
//-->
</script>
</html>