package com.spring.web.board.impl;

import java.util.List;

import com.spring.web.board.BoardVO;

public class BoardDAO implements Service {

	final String GET_BOARD = "select * from myboard where seq = ?";
	
	@Override
	public BoardVO getBoard() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BoardVO> getBoardList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

}
