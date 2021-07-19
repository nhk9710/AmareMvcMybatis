package kr.or.project.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import kr.or.project.service.BoardService;
import kr.or.project.vo.BoardVO;

@Controller("boardController")
@EnableAspectJAutoProxy
public class BoardControllerImpl extends MultiActionController implements BoardController {
	private static final Logger logger = LoggerFactory.getLogger(BoardControllerImpl.class);
	@Autowired
	private BoardService boardService;
	@Autowired
	private BoardVO boardVO;
	

	@Override
	@RequestMapping(value = "board/listBoards.do", method = RequestMethod.GET )
	public ModelAndView listBoards(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String viewName = getViewName(request);
		logger.info("viewName :" + viewName);
		
		
		List boardsList = boardService.listBoards();
		ModelAndView mav = new ModelAndView(viewName);
		mav.addObject("boardsList", boardsList);
		
		return mav;
	}
	
	public String getViewName(HttpServletRequest request) throws Exception {
		String contextPath = request.getContextPath();
		System.out.println("contextPath : " + contextPath);
		
		String uri = (String)request.getAttribute("javax.servlet.include.request_uri");
		System.out.println("uri :" + uri);
		
		if (uri == null || uri.trim().equals("")) {
			uri = request.getRequestURI();
			System.out.println("uri : " + uri);
		}
		
		int begin = 0;
		if( (contextPath == null || ("".equals(contextPath)))) {
			begin = contextPath.length();
			System.out.println("begin : " + begin);
		}
			
			int end;
			if(uri.indexOf(";") != -1) {		//uri값에 ; 문자를 찾았다면
				end = uri.indexOf(";");
			} else if (uri.indexOf("?") != -1) {		//uri값에 ? 문자를 찾았다면
				end = uri.indexOf("?");
			} else {
				end = uri.length();
			}
			String fileName = uri.substring(begin, end);
			logger.info("1.fileName :" + fileName);
			
			if (fileName.indexOf(".") != -1) {				// view fileName(즉 jsp)에서 확장자를 제외함
				fileName = fileName.substring(0, fileName.lastIndexOf("."));
				
			}
			
			if(fileName.indexOf("/") != -1) {				// view fileName에서 앞에 폴더 있다면 제외함.
				fileName = fileName.substring(fileName.lastIndexOf("/",1), fileName.length());
			}
			logger.info("2.fileName :" + fileName);
			return fileName;
	}
	
	@RequestMapping(value = "/board/*Form.do", method = {RequestMethod.GET, RequestMethod.POST} )
	public ModelAndView form(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String viewName = getViewName(request);
		ModelAndView mav = new ModelAndView();
		mav.setViewName(viewName);
		return mav;
	}
	
	

	@RequestMapping(value = "/board/removeBoard.do", method = {RequestMethod.GET, RequestMethod.POST} )
	public ModelAndView removeBoard(@RequestParam("qa_No") int qa_No, HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		
		boardService.removeBoard(qa_No);
		ModelAndView mav = new ModelAndView("redirect:/board/listBoards.do");
		
		return mav;
	}

	@RequestMapping(value = "/board/addBoard.do", method = RequestMethod.GET )
	public ModelAndView addBoard(@ModelAttribute("board") BoardVO board, HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		
		
		int result = boardService.addBoard(board);
		
		ModelAndView mav = new ModelAndView("redirect:/board/listBoards.do");
		
		return mav;
	}

	@RequestMapping(value = "/board/viewBoard.do", method = RequestMethod.GET )
	public ModelAndView viewBoard(@RequestParam("qa_No") int qa_No, HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		
		
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("/viewBoard");
		mav.addObject("vo", boardService.viewBoard(qa_No));
		
		return mav;
	}
	

	@RequestMapping(value = "/board/updateBoard.do", method = RequestMethod.POST )
	public ModelAndView updateBoard(@ModelAttribute("boardVO") BoardVO boardVO, HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		
		ModelAndView mav = new ModelAndView("redirect:/board/listBoards.do");
		boardService.updateBoard(boardVO);
	
		return mav;
	}

	@Override
	public ModelAndView addBoard(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelAndView removeBoard(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelAndView viewBoard(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelAndView updateBoard(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
