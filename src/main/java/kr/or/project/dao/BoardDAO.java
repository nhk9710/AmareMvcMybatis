package kr.or.project.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import kr.or.project.vo.BoardVO;

public interface BoardDAO {
	public List selectAllBoardList() throws DataAccessException;

	public int deleteBoard(int qa_No) throws DataAccessException;

	public int insertBoard(BoardVO boardVO) throws DataAccessException;

	public BoardVO viewBoard(int qa_No) throws DataAccessException;

	public void updateBoard(BoardVO boardVO) throws DataAccessException ;

}
