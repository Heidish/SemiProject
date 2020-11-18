package com.hj.controller.aciton;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hj.dao.PokemonDAO;
import com.hj.dao.TrainDAO;
import com.hj.dto.PokemonVO;
import com.hj.dto.TrainVO;

public class FieldAgainAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		TrainDAO trainDAO = new TrainDAO(); 
		TrainVO trainerInfo = new TrainVO();
		PokemonVO pokemonVO = new PokemonVO();

		int index = Integer.parseInt(request.getParameter("index"));			
		String user_id = request.getParameter("user_id");
		int t_id = trainDAO.getTrainID(user_id);
		trainerInfo = trainDAO.getTrainerInfo(t_id);
		
		System.out.println("배틀액션에서 index : " + index);
		System.out.println("배틀액션에서 user_id : " + user_id);
		
		HttpSession session = request.getSession();
		List<PokemonVO> allpokemonList = (ArrayList) session.getAttribute("list");
		
		pokemonVO.setPokemonname("none");
		allpokemonList.set(index, pokemonVO);
		
		
		System.out.println("none 맞는지 확인 : " + allpokemonList.get(index).getPokemonname());
	
		request.setAttribute("trainerInfo", trainerInfo);
		request.setAttribute("allpokemonList", allpokemonList);
		RequestDispatcher dispatcher = request.getRequestDispatcher("field.jsp");
		dispatcher.forward(request, response);
		
	
	}

}
