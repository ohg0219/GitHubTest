package com.spring.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.spring.web.board.BoardVO;


@Controller
public class BoardController {



	@GetMapping("/board")
	public String board(Model model) {
		List<BoardVO> list = new ArrayList<BoardVO>();
		for(int i =0; i<=10;i++) {
			BoardVO vo = new BoardVO();
			vo.setCnt(i);
			vo.setContent("내용");
			vo.setTitle(i + "번째제목");
			vo.setWriter("나");
			list.add(vo);
		}
		model.addAttribute("list",list);
		return "board";
	}

}
