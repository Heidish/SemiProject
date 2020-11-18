<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String id = (String)request.getAttribute("login_id");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>trainer_form_test.jsp</title>
<link rel="stylesheet" href="resources/trainer.css" type="text/css"></link>
</head>
<body>
<div align = center>
	<h2> 트레이너 등록 </h2>
	<hr>
	<br>
		<form name=form1 method="post" action = "http://localhost:9000/hj_project/PokemonsterServlet?key=trainer_result">
		<table>
			<tr>
				<td> 캐릭터 </td>
				<td> 
					&nbsp; <img src="/hj_project/resources/지우.png" width="100" height="150">
					<img src="/hj_project/resources/이슬.png" height="150">&nbsp; &nbsp; &nbsp; 
					<img src="/hj_project/resources/웅.png" height="150">
					<br>
					&nbsp; <input type="radio" name="charimage" checked required value="지우"> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 
					<input type="radio" name="charimage" value="이슬"> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 
					<input type="radio" name="charimage" value="웅">
				</td>
			
			</tr>
			<tr>
				<td> 닉네임 </td>
				<td> <input type="text" size=20 name="nickname" autofocus required placeholder="공백없이 입력하세요."> </td>
			</tr>
			<tr>
				<td> 소개 </td>
				<td> <textarea rows="5" cols="30" name="content"></textarea> </td>
			</tr>
			<tr>
				<td> 도시 </td>
				<td>
					<select name="loc">
						<option selected> 연두마을 </option>
						<option> 고동마을 </option>
					</select>
				</td>
			</tr>
			<tr>
				<td> 시작 포켓몬 </td>
				<td> 
					<select name="pokemon">
					<option selected> 독침붕 </option>
					<option> 루기아 </option>
					<option> 리자몽 </option>
					<option> 치코리타 </option>
					<option> 토게피 </option>
					<option> 피츄 </option>
					</select>
				 </td>
			</tr>			
		</table>
		<br />
		<input type="hidden" name="user_id" value="<%= id%>">
		<input type="image" name="submit" src="/hj_project/resources/conf.png" width = "150" height = "150">	 
	</form>
</div>

</body>
</html>