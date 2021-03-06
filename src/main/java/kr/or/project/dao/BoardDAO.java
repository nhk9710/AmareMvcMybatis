package kr.or.project.dao;

import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;

import kr.or.project.vo.BoardVO;

public interface BoardDAO {
	public List<BoardVO> selectAllBoardList(Map<String, Integer> pagingMap) throws DataAccessException;

	public int deleteBoard(int qa_No) throws DataAccessException;

	public int insertBoard(BoardVO boardVO) throws DataAccessException;

	public BoardVO viewBoard(int qa_No) throws DataAccessException;

	public void updateBoard(Map articleMap) throws DataAccessException ;

	public int selectTotBoards() throws DataAccessException;

	public BoardVO selectArticle(int qa_No) throws DataAccessException;

}
