package com.hj.controller.aciton;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hj.dao.UserDAO;
import com.hj.dto.UserVO;


public class JoinResultAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserVO userVO = new UserVO();
		UserDAO userDAO = new UserDAO();
		
		userVO.setId(request.getParameter("id"));
		userVO.setPw(request.getParameter("pw"));
		userVO.setName(request.getParameter("name"));
		userVO.setAge(request.getParameter("age"));
		userVO.setSex(request.getParameter("sex"));
		
		String temp="JOIN NOT OK";
		
		if(userDAO.add(userVO)) {
			temp = "JOIN OK";
		}
		
		request.setAttribute("result", temp);
		request.setAttribute("trainer", userVO);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("join_result.jsp");
		dispatcher.forward(request, response);
	}

}
