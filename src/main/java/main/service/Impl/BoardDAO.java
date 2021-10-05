package main.service.Impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import main.service.BoardVO;

@Repository("boardDAO")
public class BoardDAO extends EgovAbstractDAO{

	public String insertBoard( BoardVO vo ) throws Exception {		
		return (String) insert("boardDAO.insertBoard",vo);
	}

	public List<?> selectBoardList(BoardVO vo) {		
		return (List<?>) list("boardDAO.selectBoardList", vo);
	}

	public int selectBoardTotal(BoardVO vo) {
		return (int) select("boardDAO.selectBoardTotal",vo);
	}

	public BoardVO selectBoardDetail(int unq) {
		return  (BoardVO) select("boardDAO.selectBoardDetail", unq);
	}

	public int updateBoardHits(int unq) {
		return update("boardDAO.updateBoardHits",unq);
	}
		
}
