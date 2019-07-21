<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1.0,maximum-scale=1">
		<title>프로젝트상단</title>
		<link rel="stylesheet" href="/CallBoard/css/header.css">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js"></script>
	</head>
	<body>
	<div class="topnav">
	  <a class="active" href="#home">Home</a>
	  <a href="#about">About</a>
	  <a href="#contact">Contact</a>
	  <div class="login-container">
	    <form id="userlogin" name="userlogin" method="post" action="/CallBoard/user/logincheck">
	      <input type="text" placeholder="userid" id="user_id" name="user_id">
	      <input type="password" placeholder="Password" id="user_pass" name="user_pass">
	      <button type="button" id="loginBtn">로그인</button>
	    </form>
	  </div>
	  <a href="/CallBoard/user/MemEntry" class="mem-sign">회원가입</a>
	</div> 
	</body>
	<script type="text/javascript">
		$("#loginBtn").click(function(){
			if($("#user_id").val() == ""){
			    alert('아이디를 입력하세요.');	
			    return;
			}else if($("#user_pass").val() == ""){
				alert('비밀번호를 입력하세요.');	
				return;
			}else{
				$('#userlogin').submit();	
			}
		});	
	</script>	