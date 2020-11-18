<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.hj.dto.*, java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Pokemon Field</title>
<link rel="stylesheet" href="resources/trainer.css" type="text/css"></link>
</head>
<body>
	<%
		TrainVO vo = (TrainVO) request.getAttribute("trainerInfo");
		List<PokemonVO> allpokemonList = (ArrayList)request.getAttribute("allpokemonList");
	%>
		<div align = "center">
			<div class="home">
				<a href="http://localhost:9000/hj_project/pokemon_main.html" target="_self" >
					<img src="/hj_project/resources/logout.png" width = "130" height = "130" alt="메인으로">
				</a>
			</div>
			<h2> &nbsp;&nbsp;&nbsp; 포켓몬 필드 </h2>
			<hr>
			<div class="field">
				<img src="/hj_project/resources/
				<%= vo.getCharimage() %>
				.png" height = "300" alt="트레이너이미지_필드">
				<br>
				<%= vo.getNickname() %>
				<br>
				<br>
				<a href="http://localhost:9000/hj_project/PokemonsterServlet?key=show&user_id=<%=vo.getU_id() %>" target="_self" >
					<input type="image" src="/hj_project/resources/showPokemon.png"  width = "110" height = "140" alt="보유포켓몬">
				</a>						
			</div>
			<div class="field">
				<img src="/hj_project/resources/필드.png" width = "800" height = "500" alt="필드">
			</div>
			<div style="position: absolute;">
				<div style="position: relative; top: 100px; left: 300px;">
					<a href="http://localhost:9000/hj_project/PokemonsterServlet?key=poke&pname=<%=allpokemonList.get(0).getPokemonname() %>&user_id=<%=vo.getU_id() %>&index=0" target="_self" >
					<img src="/hj_project/resources/<%=allpokemonList.get(0).getPokemonname() %>.png" width= "60" height = "60" alt="독침붕">
					</a>
				</div>
				<div style="position: relative; top: 300px; left: 270px;">
					<a href="http://localhost:9000/hj_project/PokemonsterServlet?key=poke&pname=<%=allpokemonList.get(1).getPokemonname() %>&user_id=<%=vo.getU_id() %>&index=1" target="_self" >
					<img src="/hj_project/resources/<%=allpokemonList.get(1).getPokemonname() %>.png" width= "60" height = "60" alt="루기아">
					</a>
				</div>
				<div style="position: relative; top: 100px; left: 420px;">
					<a href="http://localhost:9000/hj_project/PokemonsterServlet?key=poke&pname=<%=allpokemonList.get(2).getPokemonname() %>&user_id=<%=vo.getU_id() %>&index=2" target="_self" >
					<img src="/hj_project/resources/<%=allpokemonList.get(2).getPokemonname() %>.png" width= "60" height = "60" alt="리자몽">
					</a>
				</div>
				<div style="position: relative; top: 40px; left: 660px;">
					<a href="http://localhost:9000/hj_project/PokemonsterServlet?key=poke&pname=<%=allpokemonList.get(3).getPokemonname() %>&user_id=<%=vo.getU_id() %>&index=3" target="_self" >
					<img src="/hj_project/resources/<%=allpokemonList.get(3).getPokemonname() %>.png" width= "60" height = "60">
					</a>
				</div>
				<div style="position: relative; top: -200px; left: 580px;">
					<a href="http://localhost:9000/hj_project/PokemonsterServlet?key=poke&pname=<%=allpokemonList.get(4).getPokemonname() %>&user_id=<%=vo.getU_id() %>&index=4" target="_self" >
					<img src="/hj_project/resources/<%=allpokemonList.get(4).getPokemonname() %>.png" width= "60" height = "60">
					</a>
				</div>
				<div style="position: relative; top: 80px; left: 740px;">
					<a href="http://localhost:9000/hj_project/PokemonsterServlet?key=poke&pname=<%=allpokemonList.get(5).getPokemonname() %>&user_id=<%=vo.getU_id() %>&index=5" target="_self" >
					<img src="/hj_project/resources/<%=allpokemonList.get(5).getPokemonname() %>.png" width= "60" height = "60">
					</a>
				</div>
				<%
					session.setAttribute("list", allpokemonList);
				%>	
			</div>
		</div>
</body>
</html>