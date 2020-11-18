<%@ tag language="java" pageEncoding="UTF-8"%>

<% 
		String capturePokemon = (String) request.getAttribute("capturePokemon");
%>
	<h2> 포켓몬 포획</h2>
	<hr>
	
	<table>
		<tr>
			<td>
				<%=capturePokemon %> 을/를 포획하였습니다!
			</td>
		</tr>
		<tr>
			<td>
				<img src="/hj_project/resources/
				<%=capturePokemon %>
				.png" height = "150" alt="포획포켓몬">				
			</td>
		</tr>
	</table><br />