package com.hj.controller.aciton;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.hj.dao.PokemonDAO;
import com.hj.dto.PokemonVO;

public class ShowAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PokemonDAO pokemonDAO = new PokemonDAO();
		String id = request.getParameter("user_id");
		
		List<PokemonVO> pokemonvoList = pokemonDAO.getPokemonList(id);
		
		response.setContentType("text/html; charset=UTF-8");
		
		if(pokemonvoList.size()==0) {
			System.out.println("alert실행안");
			PrintWriter out = response.getWriter();
			out.println("<script>");
			out.println("alert('보유 포켓몬이 없습니다.')");
			out.println("history.back()");
			out.println("</script>");
		}else {
			request.setAttribute("pokemonList", pokemonvoList);
			RequestDispatcher dispatcher = request.getRequestDispatcher("show_pokemon.jsp");
			dispatcher.forward(request, response);
		}
	}

}
