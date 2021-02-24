package com.spring.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.web.board.BoardVO;
import com.spring.web.board.impl.BoardDAO;


@Controller
public class BoardController {

	@Autowired
	BoardDAO dao;

	@GetMapping("/board")
	public String board(Model model) {
		
		model.addAttribute("list",dao.getBoardList());
		return "board";
	}

	@GetMapping("/getBoard")
	public String getBoard(Model model, @RequestParam(value="seq")String seq) {
		
				model.addAttribute("vo",dao.getBoard(Integer.parseInt(seq)));
				
		
		return "getBoard";
	}
}
