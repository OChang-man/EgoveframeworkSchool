package egovframework.let.Board.service;

import java.util.List;

import org.egovframe.rte.psl.dataaccess.util.EgovMap;

public interface BoardService {
	
	//임시데이터 가져오기
	public BoardVO selectBoard(BoardVO vo) throws Exception;
	//임시데이터 등록하기
	public String insertBoard(BoardVO vo) throws Exception;
	//임시데이터목록 가져오기
	public List<EgovMap> selectBoardList(BoardVO vo) throws Exception;
	//임시데이터 목록 수
	public int selectBoardListCnt(BoardVO vo) throws Exception;
	//임시데이터 수정하기
	public void updateBoard(BoardVO vo) throws Exception;
	//임시데이터 삭제하기
	public void deleteBoard (BoardVO vo) throws Exception;
}
