package com.hj.controller.aciton;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hj.dao.PokemonDAO;

public class CaptureAction implements Action {
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PokemonDAO pokemonDAO = new PokemonDAO();
		
		String pokemonname = request.getParameter("capPokemon");
		String user_id = request.getParameter("user_id");
		String index = request.getParameter("index");
		System.out.println("캡쳐액션에서 index : " + index);
		System.out.println("캡쳐액션에서 capPokemon : " + pokemonname);
		System.out.println("캡쳐액션에서 user_id : " + user_id);
		
		pokemonDAO.addCaptPokemon(user_id, pokemonname);
		
		request.setAttribute("capturePokemon", pokemonname);
		request.setAttribute("user_id", user_id);
		request.setAttribute("index", index);
		RequestDispatcher view = request.getRequestDispatcher("pokemon_capture.jsp");
		view.forward(request, response);
		
	}
}
