package com.spring.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.spring.web.board.BoardVO;

@Controller
public class BoardController {

	@GetMapping("/insertBoard.do")
	public String insertBoard(BoardVO vo) {
		return "/board/list";
	}
	
}
