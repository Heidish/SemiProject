<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="mytag" %>    
<%
	String user_id = (String)request.getAttribute("user_id");
	String index = (String) request.getAttribute("index");
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Pokemon Capture</title>
<link rel="stylesheet" href="resources/trainer.css" type="text/css"></link>
</head>
<body>
	<div align = "center">
		<mytag:pokemon>포켓몬 포획!</mytag:pokemon>	
		<a href="http://localhost:9000/hj_project/PokemonsterServlet?key=field_again&user_id=<%=user_id %>&index=<%=index %>" target="_self">
			<input type="image" src="/hj_project/resources/goField.png"  width =150 height = "150" alt="필드로">
		</a>
	</div>
</body>
</html>