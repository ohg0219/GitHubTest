package com.spring.web.board.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

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
	
	public BoardVO getBoard(BoardVO vo) {
		try {
			conn = ConnectionUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			ConnectionUtil.close(rs, pstmt, conn);
		}
		return null;
	}
	
	public List<BoardVO> getBoardList (BoardVO vo) {
		List<BoardVO> boardList = new ArrayList<BoardVO>();
		try {
			conn = ConnectionUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			ConnectionUtil.close(rs, pstmt, conn);
		}
		return boardList;
	}
	
}//end class
