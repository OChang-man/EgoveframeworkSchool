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
}
