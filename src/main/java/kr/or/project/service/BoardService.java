package kr.or.project.service;

import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;

import kr.or.project.vo.BoardVO;

public interface BoardService {
	public Map listBoards(Map<String, Integer> pagingMap) throws Exception;
	
	public int removeBoard(int qa_No) throws Exception;

	public int addBoard(BoardVO boardVO) throws Exception;

	public Map viewBoard(int qa_No) throws Exception;

	public Map updateBoard(Map updateMap) throws Exception;

	public Object updateForm(int qa_No);
}
