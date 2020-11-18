package com.hj.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.hj.dto.PokemonVO;
import com.hj.util.DBManager;

public class PokemonDAO {
	private static PokemonDAO instance = new PokemonDAO();
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	
	public static PokemonDAO getInstance() {
		return instance;
	}
	
	
	public ArrayList<PokemonVO> getPokemonList(String id) {
		ArrayList<PokemonVO> pokemonlist = new ArrayList<PokemonVO>();
		String sql = "select * from pokemon p, captpo c, po_user u where p.pokemonname=c.pokemonname and c.u_id = u.id and u.id = ?";
		ResultSet rs = null;
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				PokemonVO tr = new PokemonVO();
				tr.setPokemonname(rs.getString("pokemonname"));
				tr.setWeight(rs.getString("weight"));
				tr.setHeight(rs.getString("height"));
				tr.setClassification(rs.getString("Classification"));
				tr.setInfomation(rs.getString("infomation"));
				pokemonlist.add(tr);
			}
		} catch(SQLException e) {
			System.out.println("getPokemonList ERR : " + e.getMessage());
		} finally {
			DBManager.close(conn, pstmt, rs);
		}
		return pokemonlist;		
	}// getPokemonList() END
	
	
	public ArrayList<PokemonVO> getAllPokemonList(String id) {
		ArrayList<PokemonVO> pokemonlist = new ArrayList<PokemonVO>();
		String sql = "select pokemonname from pokemon";
		ResultSet rs = null;
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				PokemonVO tr = new PokemonVO();
				tr.setPokemonname(rs.getString("pokemonname"));
				pokemonlist.add(tr);
			}
		} catch(SQLException e) {
			System.out.println("getAllPokemonList ERR : " + e.getMessage());
		} finally {
			DBManager.close(conn, pstmt, rs);
		}
		return pokemonlist;		
	}// getPokemonList() END
	
	
	
	public void addCaptPokemon(String user_id, String pokemonname) {
		String sql = "insert into captpo (u_id, pokemonname) values (?,?)";
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user_id);
			pstmt.setString(2, pokemonname);

			pstmt.executeUpdate();
		} catch(SQLException e) {
			System.out.println("addCaptPokemon ERR : " + e.getMessage());
		} finally {
			DBManager.close(conn, pstmt);
		}
	}// addCaptPokemon() END
	
}
