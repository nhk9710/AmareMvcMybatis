package kr.or.project.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import kr.or.project.vo.BoardVO;

public interface BoardService {
	public List listBoards() throws DataAccessException;
	
	public int removeBoard(int qa_No) throws DataAccessException;

	public int addBoard(BoardVO boardVO) throws DataAccessException;

	public BoardVO viewBoard(int qa_No) throws DataAccessException;

	public void updateBoard(BoardVO boardVO) throws DataAccessException;
}
