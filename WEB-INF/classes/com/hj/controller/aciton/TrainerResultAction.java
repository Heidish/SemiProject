package com.hj.controller.aciton;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.hj.dao.TrainDAO;
import com.hj.dto.TrainVO;
import com.hj.dto.UserVO;

public class TrainerResultAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		TrainVO trainVO = new TrainVO();
		TrainDAO trainDAO = new TrainDAO();
		
		String id = request.getParameter("user_id");
		System.out.println("TrainerResultAction의 id : " + id);
		
		UserVO userVO = new UserVO();
		
		trainVO.setCharimage(request.getParameter("charimage"));
		trainVO.setNickname(request.getParameter("nickname"));
		trainVO.setContent(request.getParameter("content"));
		trainVO.setLoc(request.getParameter("loc"));
		trainVO.setPokemon(request.getParameter("pokemon"));
		
		trainVO.setU_id(id);
		userVO.setId(id);
		
		String temp="JOIN NOT OK";
		
		if(trainDAO.add(trainVO, userVO)) {
			temp = "JOIN OK";
		}
		
		request.setAttribute("user_id", id);
		request.setAttribute("trainer", trainVO);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("trainer_result.jsp");
		dispatcher.forward(request, response);
	}

}
