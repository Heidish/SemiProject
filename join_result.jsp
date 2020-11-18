<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.hj.dto.TrainVO"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="mytag" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Join Result</title>
<link rel="stylesheet" href="resources/trainer.css" type="text/css"></link>
</head>
<body>
	<div align = "center">
		<mytag:user>유저 등록 완료!</mytag:user>
		<a href="http://localhost:9000/hj_project/PokemonsterServlet?key=login" target="_self">
			<input type="image" src="/hj_project/resources/login.png"  width =150 height = "150" alt="로그인으로">
		</a>
	</div>
</body>
</html>