package kr.or.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import kr.or.project.dao.BoardDAO;
import kr.or.project.vo.BoardVO;

@Service("boardService")
@Transactional(propagation = Propagation.REQUIRED)
public class BoardServiceImpl implements BoardService{
	@Autowired
	private BoardDAO boardDAO;
	
	
	public void setBoardDAO(BoardDAO boardDAO) {
		this.boardDAO = boardDAO;
	}


	@Override
	public List listBoards() throws DataAccessException {
		List boardsList = boardDAO.selectAllBoardList();
		return boardsList;
	}


	@Override
	public int removeBoard(int qa_No) throws DataAccessException {
		
		return boardDAO.deleteBoard(qa_No);
	}


	@Override
	public int addBoard(BoardVO boardVO) throws DataAccessException {
		
		return boardDAO.insertBoard(boardVO);
	}


	@Override
	public BoardVO viewBoard(int qa_No) throws DataAccessException {
		
		return boardDAO.viewBoard(qa_No);
		
	
		
	}


	@Override
	public void updateBoard(BoardVO boardVO) throws DataAccessException {
		
		 boardDAO.updateBoard(boardVO);
	}
}
