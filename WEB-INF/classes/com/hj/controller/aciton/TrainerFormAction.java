package com.hj.controller.aciton;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TrainerFormAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String login_id= request.getParameter("u_id");
		System.out.println("TrainerFormAction의 id : " + login_id);
		
		request.setAttribute("login_id", login_id);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("trainer_form_test.jsp");
		dispatcher.forward(request, response);
	
	}

}
