package com.spring.web.board.impl;

import java.util.List;

import com.spring.web.board.BoardVO;

public interface BoardService {
	BoardVO getBoard(int seq);
	
	List<BoardVO> getBoardList();
	
	void delete();
	
	void update();
}
