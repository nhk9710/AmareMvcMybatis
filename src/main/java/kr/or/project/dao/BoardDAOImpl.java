package kr.or.project.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import kr.or.project.vo.BoardVO;

@Repository("boardDAO")
public class BoardDAOImpl implements BoardDAO {
	@Autowired
	private SqlSession sqlSession;
	
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public List selectAllBoardList() throws DataAccessException {
		List<BoardVO> boardsList = sqlSession.selectList("mapper.board.selectAllBoardList");
		return boardsList;
	}

	@Override
	public int deleteBoard(int qa_No) throws DataAccessException {
		int result = sqlSession.delete("mapper.board.deleteBoard", qa_No);
		return result;
	}

	@Override
	public int insertBoard(BoardVO boardVO) throws DataAccessException {
		int result = sqlSession.insert("mapper.board.insertBoard", boardVO);
		return result;
	}

	@Override
	public BoardVO viewBoard(int qa_No) throws DataAccessException {
	
		return sqlSession.selectOne("mapper.board.viewBoard", qa_No);
		
	}

	public void updateBoard(BoardVO boardVO) throws DataAccessException {
		
		sqlSession.update("mapper.board.updateBoard", boardVO);
	}

}
