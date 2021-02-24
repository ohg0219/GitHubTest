package com.spring.web.board.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import com.spring.web.board.BoardVO;
import com.spring.web.connection.JDBCUtil;

@Repository
public class BoardDAO implements BoardService {
	
	public Connection conn = null;
	public PreparedStatement pstmt = null;
	public ResultSet rs = null;
	
	final String GET_BOARD = "select * from myboard where seq = ?";
	final String GET_BOARD_LIST = "select * from myboard order by seq desc";
	
	@Override
	public BoardVO getBoard(int seq) {
		BoardVO vo = new BoardVO();
		try {
			conn = JDBCUtil.getConnection();
			pstmt = conn.prepareStatement(GET_BOARD);
			pstmt.setInt(1, seq);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				vo.setSeq(rs.getInt(1));
				vo.setTitle(rs.getString(2));
				vo.setWriter(rs.getString(3));
				vo.setContent(rs.getString(4));
				vo.setRegDate(rs.getDate(5));
				vo.setCnt(rs.getInt(6));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCUtil.close(rs, pstmt, conn);
		}
		return vo;
	}

	@Override
	public List<BoardVO> getBoardList() {
		System.out.println("getBoardList");
		List<BoardVO> list = new ArrayList<BoardVO>();
		conn = JDBCUtil.getConnection();
		try {
			pstmt = conn.prepareStatement(GET_BOARD_LIST);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				BoardVO vo = new BoardVO();
				vo.setSeq(rs.getInt(1));
				vo.setTitle(rs.getString(2));
				vo.setWriter(rs.getString(3));
				vo.setContent(rs.getString(4));
				vo.setRegDate(rs.getDate(5));
				vo.setCnt(rs.getInt(6));
				list.add(vo);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(rs, pstmt, conn);
		}
		
		
		return list;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}


}
