/**
 * TrainDAO.java
 * 2018. 10. 27.
 * 파일설명 : 
 */
package com.hj.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.hj.dto.TrainVO;
import com.hj.dto.UserVO;
import com.hj.util.DBManager;

public class TrainDAO {
	private static TrainDAO instance = new TrainDAO();

	Connection conn = null;
	PreparedStatement pstmt = null;
	
	public static TrainDAO getInstance() {
		return instance;
	}
	
	public boolean add(TrainVO tr, UserVO uv) {
		String sql = "insert into trainer values (trainer_sq.nextval, ?, ?, ?, ?, ?,?)";
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, tr.getCharimage());
			pstmt.setString(2, tr.getNickname());
			pstmt.setString(3, tr.getContent());
			pstmt.setString(4, tr.getLoc());
			pstmt.setString(5, tr.getPokemon());
			pstmt.setString(6, uv.getId());

			pstmt.executeUpdate();
		} catch(SQLException e) {
			e.printStackTrace();
			return false;
		} finally {
			DBManager.close(conn, pstmt);
		}
		return true;
	}// add() END
	
	
	public int getTrainID(String user_id) {
		String sql = "select t_id from trainer where u_id=?";
		ResultSet rs = null;
		int t_id = 0;
				 
         try {
        	conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user_id);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				t_id = rs.getInt("t_id");
			}
	       
		} catch (SQLException e) {
			System.out.println("getTrainID ERR : " + e.getMessage());
		}finally {
			DBManager.close(conn, pstmt, rs);
		}

		return t_id;
	}// getTrainID() END
	
	public TrainVO getTrainerInfo(int t_id) {
	      String sql = "select * from trainer where t_id=?";
	      TrainVO trainerInfo = new TrainVO();
	      ResultSet rs = null;
	      try {
	         conn = DBManager.getConnection();
	         pstmt = conn.prepareStatement(sql);
	         pstmt.setInt(1, t_id);
	         
	         rs = pstmt.executeQuery();
	         
	         while(rs.next()) {
	        	trainerInfo.setT_id(rs.getInt("t_id"));
	            trainerInfo.setCharimage(rs.getString("charimage"));
	            trainerInfo.setNickname(rs.getString("nickname"));
	            trainerInfo.setContent(rs.getString("content"));
	            trainerInfo.setLoc(rs.getString("loc"));
	            trainerInfo.setPokemon(rs.getString("pokemon"));
	            trainerInfo.setU_id(rs.getString("u_id"));
	         }
	   
	      } catch(SQLException e) {
	         e.printStackTrace();
	      } finally {
	         DBManager.close(conn, pstmt, rs);
	      }
	      return trainerInfo;
	   }// getTrainerInfo() END

}
