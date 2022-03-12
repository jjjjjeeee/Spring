<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
	<link rel="stylesheet" href="js_css/style.css" type="text/css"/>
	<script src='js_css/script.js'></script>
</head>
<body>
<div>
	<h1>
		재실행!
	</h1>
	<ul>
		<li><a href="/myapp/t1?num=123&name=시조새">서버에 접속하기1(Get)</a></li>
		<li><a href="/myapp/t2?num=123&name=시조새">서버에 접속하기2(Get)</a></li>
		<li><a href="/myapp/t3?num=123&name=시조새">서버에 접속하기3(Get)</a></li>
		<li><a href="/myapp/t4?num=666&name=떡국">서버에 접속하기4(Get)</a></li>
	</ul>
	
	<P>  The time on the server is ${serverTime}. </P>
	<p> ${msg }</p>
</div>
<div>
	<form method="get" action="/myapp/form1">
		번호 : <input type="text" name="num"/><br/>
		이름 : <input type="text" name="name"/><br/>
		<input type="submit" value="서버로 보내기"/>		
	</form>
	<hr/>
	<form method="post" action="/myapp/form2">
		번호 : <input type="text" name="num"/><br/>
		이름 : <input type="text" name="name"/><br/>
		<input type="submit" value="서버로 보내기"/>		
	</form>
</div>
<img src="/myapp/img/11.png" style="width:200px"/>
</body>
</html>
