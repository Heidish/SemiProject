<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.hj.dto.*, java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Trainer List</title>
<link rel="stylesheet" href="resources/trainer.css" type="text/css"> 
</head>
<body>
	<% 
		TrainVO vo = (TrainVO) request.getAttribute("trainer");
	%>
	<h2> 트레이너 정보 </h2>
	<hr>
	<div align = "center">
	
		<table>
			<tr>
				<td> 닉네임 </td>
				<td> 소개 </td>
				<td> 도시 </td>
				<td> 보유 포켓몬 </td>
			</tr>
	
			<tr>
				<td> <%=vo.getNickname() %> </td>
				<td> <%=vo.getContent() %> </td>
				<td> <%=vo.getLoc() %> </td>
				<td> 
					<img src="/hj_project/resources/
					<%=vo.getPokemon() %>
					.png" width = "100" height = "100" alt="포켓몬">
				</td>
			</tr>
		</table>
		<button class ="back" onclick="history.back();">
			<img src="/hj_project/resources/back.png" width= "110" height = "140" alt="뒤로">
		</button>	
	</div>
</body>
</html>