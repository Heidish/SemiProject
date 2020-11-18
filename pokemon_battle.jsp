<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<%
	String user_id = (String) request.getAttribute("user_id");
	String index = (String) request.getAttribute("index");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Pokemon battle</title>
<link rel="stylesheet" href="resources/trainer.css" type="text/css"></link>
</head>
<body>
	<form name=form1 method="post" action = "http://localhost:9000/hj_project/PokemonsterServlet?key=capture&user_id=<%=user_id%>">

	<input type = hidden name ="capPokemon" value="${pokemonName}">
	<input type = hidden name ="index" value="${index}">
	<audio src="/hj_project/resources/capture.mp3" autoplay loop></audio>
	<div align = "center">
		<h2> 포켓몬 포획 </h2>
		<hr>
		
		<table>
			<tr>
				<td>
					<img src="/hj_project/resources/
					${pokemonName}
					_배틀.png" height = "300" alt="배틀포켓몬">
				</td>
			</tr>
		</table><br />
		
		앗! 야생의${pokemonName} 이/가 나타났다! 
		<br /><br />
		
		<input type="image" name="submit" src="/hj_project/resources/monsterball.png" width = "110" height = "140">
	</div> 
	</form>
	<div align="center">
		<button class ="back" onclick="history.back();">
			<img src="/hj_project/resources/back.png" width= "110" height = "140" alt="뒤로">
		</button>		
	</div>
</body>
</html>