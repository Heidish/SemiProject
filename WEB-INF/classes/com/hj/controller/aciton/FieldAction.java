package com.hj.controller.aciton;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hj.dao.PokemonDAO;
import com.hj.dao.TrainDAO;
import com.hj.dto.PokemonVO;
import com.hj.dto.TrainVO;

public class FieldAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		TrainDAO trainDAO = new TrainDAO(); 
		TrainVO trainerInfo = new TrainVO();
		PokemonDAO pokemonDAO = new PokemonDAO();
		
		
//		String index = request.getParameter("index");
//		
//		if (index)
		
		String user_id = request.getParameter("user_id");
		int t_id = trainDAO.getTrainID(user_id);
		// t_id 는 트레이너가 존재하면 1 이상, 트레이너가 없으면 0을 반환함

		List<PokemonVO> allpokemonList = pokemonDAO.getAllPokemonList(user_id);
		
		String temp = "";
		response.setContentType("text/html; charset=UTF-8");
		
		if (t_id > 0) {
			trainerInfo = trainDAO.getTrainerInfo(t_id);
			request.setAttribute("trainerInfo", trainerInfo);
			request.setAttribute("allpokemonList", allpokemonList);
			RequestDispatcher dispatcher = request.getRequestDispatcher("field.jsp");
			dispatcher.forward(request, response);
		} else if (t_id == 0) {
			temp = "트레이너를 생성 해 주세요.";
			PrintWriter out = response.getWriter();
			out.println("<script>");
			out.println("alert('트레이너를 생성 해 주세요.')");
			out.println("history.back()");
			out.println("</script>");
		}
		System.out.println("FieldAction 의 temp : " + temp);
	}

}
