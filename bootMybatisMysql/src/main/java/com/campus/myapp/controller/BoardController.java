package com.campus.myapp.controller;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.campus.myapp.service.BoardService;

@RestController
public class BoardController {
	@Inject
	BoardService service;
	@GetMapping("/board/boardList")
	public ModelAndView allSelect() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("lst", service.allSelect());
		mav.setViewName("board/boardList");
		return mav;
	}
}
