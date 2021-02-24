package com.spring.web.board.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.spring.web.board.BoardVO;
import com.spring.web.board.connection.ConnectionUtil;

public class BoardDAO {
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	String sql = "";

	public void insertBoard(BoardVO vo) {//새글 등록
		try {
			conn = ConnectionUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ConnectionUtil.close(pstmt, conn);
		}
	}

	public void updateBoard(BoardVO vo) {//수정
		try {
			conn = ConnectionUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			ConnectionUtil.close(pstmt, conn);
		}
	}

	public void deleteBoard(BoardVO vo) {//삭제
		try {
			conn = ConnectionUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ConnectionUtil.close(pstmt, conn);
		}
	}

}
