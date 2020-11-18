<%@ tag language="java" pageEncoding="UTF-8"%>

<%
	 String id = request.getParameter("id");
	 String pw = request.getParameter("pw");
	 String name = request.getParameter("name");
	 String age = request.getParameter("age");
	 String sex = request.getParameter("sex");
	 
%>
<h2><jsp:doBody/></h2>
	<hr>
	<br />
	<table style="width: 300px;">
		<tr>
			<td> 아 이 디 </td>
			<td> <%= id %> </td>
		</tr>
		
		<tr>
			<td> 비밀번호 </td>
			<td> <%= pw %> </td>
		</tr>
		<tr>
			<td> 이름 </td>
			<td> <%= name %></td>
		</tr>
		<tr>
			<td> 나이 </td>
			<td> <%=age %> </td>
		</tr>
		<tr>
			<td> 성별 </td>
			<td> <%=sex %> </td>
		</tr>
								
	</table><br />