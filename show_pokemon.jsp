<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.hj.dto.*, java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>show all pokemon</title>
<link rel="stylesheet" href="resources/trainer.css" type="text/css"> 

</head>
<body>
	<div class="home">
		<a href="http://localhost:9000/hj_project/pokemon_main.html" target="_self" >
			<img src="/hj_project/resources/logout.png" width= "130" height = "130" alt="메인으로">
		</a>	
	</div>	
	<h2> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 포켓몬 도감  </h2>
	<hr>
	
	<div align = "center">
			<%	
				List<PokemonVO> pokemonList = (List<PokemonVO>)request.getAttribute("pokemonList");	
				for(PokemonVO vo : pokemonList) {
			%>
				<table id="pokemonBook">
					<tr>
						<td rowspan ="5">
							<img src="/hj_project/resources/
							<%= vo.getPokemonname() %>
							.png" width = "100" height = "100" alt="포켓몬">
						</td>						
						<td> 이름  </td>
						<td> <%= vo.getPokemonname() %> </td>
					</tr>
					<tr>
						<td> 몸무게  </td>
						<td> <%= vo.getWeight() %> </td>
					</tr>
					<tr>
						<td> 키  </td>
						<td> <%= vo.getHeight() %> </td>
					</tr>
					<tr>
						<td> 분류  </td>
						<td> <%= vo.getClassification() %> </td>
					</tr>
					<tr>
						<td> 설명  </td>
						<td> <%= vo.getInfomation() %> </td>
					</tr>
				</table>		
			<%
				}
			%>
			<div class="home">
				<button class ="back" onclick="history.back();">
					<img src="/hj_project/resources/back.png" width= "110" height = "140" alt="뒤로">
				</button>
			</div>
	</div>		
</body>
</html>