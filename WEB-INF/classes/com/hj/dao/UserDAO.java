package com.hj.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.hj.dto.UserVO;
import com.hj.util.DBManager;

public class UserDAO {
	private static UserDAO instance = new UserDAO();

	Connection conn = null;
	PreparedStatement pstmt = null;
	
	public static UserDAO getInstance() {
		return instance;
	}

	public boolean add(UserVO user) {
		String sql = "insert into po_user values (?,?,?,?,?)";
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user.getId());
			pstmt.setString(2, user.getPw());
			pstmt.setString(3, user.getName());
			pstmt.setString(4, user.getAge());
			pstmt.setString(5, user.getSex());
			pstmt.executeUpdate();
		} catch(SQLException e) {
			e.printStackTrace();
			return false;
		} finally {
			DBManager.close(conn, pstmt);
		}
		return true;
	}// add() END
	
	public int getUserInfo(String id, String pw) {
		String sql = "select pw from po_user where id=?";
		ResultSet rs = null;

		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);

			rs = pstmt.executeQuery();

			if (rs.next()) {
				if (rs.getString(1).equals(pw)) {
					return 1; // 로그인 성공
				} else
					return 0; // 비밀번호 불일치
			}
			return -1;	//아이디 없음
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return -2; // 데이터베이스 오류
	}// getUserInfo() END
}
