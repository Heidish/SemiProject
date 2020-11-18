<%@ tag language="java" pageEncoding="UTF-8"%>

<%
	 String charimage = request.getParameter("charimage");
	 String nickname = request.getParameter("nickname");
	 String content = request.getParameter("content");
	 String loc = request.getParameter("loc");
	 String pokemon = request.getParameter("pokemon");
%>
<h2><jsp:doBody/></h2>
	<hr>
	<table>
		<tr>
			<td rowspan="5"> 
				<img src="/hj_project/resources/
				<%=charimage %>
				.png"  height = "300" alt="트레이너이미지">
			</td>
			<td> 닉네임 </td>
			<td> <%=nickname %> </td>
		</tr>
		<tr>
			<td> 소개 </td>
			<td> <%=content %> </td>
		</tr>
		<tr>
			<td> 지역 </td>
			<td> <%=loc %> </td>
		</tr>
		<tr>
			<td> 보유 포켓몬 </td>
			<td> 
				<img src="/hj_project/resources/
				<%=pokemon %>
				.png" width = "80" height = "80" alt="포켓몬">
			</td>
		</tr>						
	</table><br />