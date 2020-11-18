package com.hj.controller.aciton;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BattelAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pokemonName = request.getParameter("pname");
		String user_id = request.getParameter("user_id");
		String index = request.getParameter("index");
		System.out.println("배틀액션에서 index : " + index);
		System.out.println("배틀액션에서 pname : " + pokemonName);
		System.out.println("배틀액션에서 user_id : " + user_id);
		
		System.out.println(pokemonName);

		request.setAttribute("pokemonName", pokemonName);
		request.setAttribute("user_id", user_id);
		request.setAttribute("index", index);
		RequestDispatcher view = request.getRequestDispatcher("pokemon_battle.jsp");
		view.forward(request, response);

	}

}
