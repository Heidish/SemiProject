<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.hj.dto.TrainVO"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="mytag" %>
<%
	String user_id = (String)request.getAttribute("user_id");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Join Result</title>
<link rel="stylesheet" href="resources/trainer.css" type="text/css"></link>
</head>
<body>
	<div align="center">
		<mytag:trainer>트레이너 등록 완료!</mytag:trainer>
		<a href="http://localhost:9000/hj_project/PokemonsterServlet?key=field&user_id=<%=user_id %>" target="_self">
			<input type="image" src="/hj_project/resources/goField.png" width=150 height="150" alt="필드로">
		</a>
	</div>
</body>
</html>