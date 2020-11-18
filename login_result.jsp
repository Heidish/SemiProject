<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.hj.dto.TrainVO, com.hj.dto.UserVO"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="mytag" %>
<%
	String id = (String)request.getAttribute("user_id");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Result</title>
<link rel="stylesheet" href="resources/trainer.css" type="text/css"></link>
</head>
<body>
	<div align = "center">
		<h2>로그인 완료!</h2>
		<hr>
		<br /><br />
		<table>
			<tr>
				<td><%= id %>님 로그인 하셨습니다.</td>
			</tr>
		</table>
		<br /><br /><br /><br />
		<a href="http://localhost:9000/hj_project/PokemonsterServlet?key=field&user_id=<%= id %>" target="_self">
			<input type="image" src="/hj_project/resources/goField.png" width = "150" height = "150" alt="필드로">
		</a>
	   
		<a href="http://localhost:9000/hj_project/PokemonsterServlet?key=trainer_form&u_id=<%= id %>" target="_self">
			<input type="image" src="/hj_project/resources/reg.png"  width = "150" height = "150" alt="트레이너등록">
		</a>
		
	</div>
</body>
</html>