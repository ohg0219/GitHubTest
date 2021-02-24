package com.spring.web.board.impl;

import java.util.List;

import com.spring.web.board.BoardVO;

public interface Service {
	BoardVO getBoard();
	
	List<BoardVO> getBoardList();
	
	void delete();
	
	void up();
}
