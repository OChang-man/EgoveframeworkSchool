package egovframework.let.board.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.egovframe.rte.fdl.cmmn.EgovAbstractServiceImpl;
import org.egovframe.rte.fdl.idgnr.EgovIdGnrService;
import org.egovframe.rte.psl.dataaccess.util.EgovMap;
import org.springframework.stereotype.Service;

import egovframework.let.board.service.BoardService;
import egovframework.let.board.service.BoardVO;
import egovframework.let.temp.service.TempService;
import egovframework.let.temp.service.TempVO;
import egovframework.let.temp2.service.Temp2Service;
import egovframework.let.temp2.service.Temp2VO;

@Service("boardService")
public class BoardServiceImpl extends EgovAbstractServiceImpl implements BoardService{
	
	@Resource(name="boardDAO")
	private BoardDAO boardDAO;
	
	//게시물 목록 가져오기
  	public List<EgovMap> selectBoardList(BoardVO vo) throws Exception {
  		return boardDAO.selectBoardList(vo);
  	}
  	
  	//게시물 목록 수
  	public int selectBoardListCnt(BoardVO vo) throws Exception {
  		return boardDAO.selectBoardListCnt(vo);
  	}
  	
  	//게시물 상세정보
  	public BoardVO selectBoard(BoardVO vo) throws Exception {
  		//조회수 업
  		boardDAO.updateViewCnt(vo);
  		/*
  		String a = null;
		if(a.equals("aa")) a = "";
  		*/
  		return boardDAO.selectBoard(vo);
  	}
  	
  	//조회수 업데이트(테스트용)
  	public void updateViewCnt(BoardVO vo) throws Exception{
  		boardDAO.updateViewCnt(vo);
  	}
}
