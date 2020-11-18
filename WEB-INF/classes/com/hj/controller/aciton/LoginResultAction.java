package com.hj.controller.aciton;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hj.dao.UserDAO;

public class LoginResultAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserDAO userDAO = new UserDAO();

		String input_id = request.getParameter("id");
		String input_pw = request.getParameter("pw");
		String temp = "";

		int result = userDAO.getUserInfo(input_id, input_pw);

		response.setContentType("text/html; charset=UTF-8");
	
		if (result == 1) {
			temp = "Login Success!";
			request.setAttribute("user_id", input_id);
			RequestDispatcher dispatcher = request.getRequestDispatcher("login_result.jsp");
			dispatcher.forward(request, response);
		} else if (result == 0) {
			temp = "비밀번호를 다시 확인해주세요.";
			PrintWriter out = response.getWriter();
			out.println("<script>");
			out.println("alert('비밀번호를 다시 확인해주세요.')");
			out.println("history.back()");
			out.println("</script>");
			
		} else if (result == -1) {
			temp = "존재하지 않는 아이디입니다.";
			PrintWriter out = response.getWriter();
			out.println("<script>");
			out.println("alert('존재하지 않는 아이디입니다.')");
			out.println("history.back()");
			out.println("</script>");
		} else if (result == -2) {
			temp = "데이터베이스 오류";
			PrintWriter out = response.getWriter();
			out.println("<script>");
			out.println("alert('데이터베이스 오류')");
			out.println("history.back()");
			out.println("</script>");
		}

		System.out.println(temp);	
	}

}
