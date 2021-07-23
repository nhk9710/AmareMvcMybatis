package kr.or.project.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import kr.or.project.vo.BoardVO;

public interface BoardController {
	public ModelAndView listBoards(HttpServletRequest request, HttpServletResponse response) throws Exception;
	public ModelAndView addBoard(HttpServletRequest request, HttpServletResponse response) throws Exception;
	public ModelAndView viewBoard(HttpServletRequest request, HttpServletResponse response) throws Exception;
	public ModelAndView removeBoard(HttpServletRequest request, HttpServletResponse response) throws Exception;
	public ModelAndView updateBoard(HttpServletRequest request, HttpServletResponse response) throws Exception;
}
