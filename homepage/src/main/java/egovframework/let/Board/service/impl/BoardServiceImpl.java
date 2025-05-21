package egovframework.let.Board.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.egovframe.rte.fdl.cmmn.EgovAbstractServiceImpl;
import org.egovframe.rte.fdl.idgnr.EgovIdGnrService;
import org.egovframe.rte.psl.dataaccess.util.EgovMap;
import org.springframework.stereotype.Service;

import egovframework.let.Board.service.BoardService;
import egovframework.let.Board.service.BoardVO;
import egovframework.let.temp.service.TempService;
import egovframework.let.temp.service.TempVO;
import egovframework.let.temp2.service.Temp2Service;
import egovframework.let.temp2.service.Temp2VO;

@Service("boardService")
public class BoardServiceImpl extends EgovAbstractServiceImpl implements BoardService{
	
	@Resource(name="boardDAO")
	private BoardDAO boardDAO;

	@Resource(name="egovTempIdGnrService")
	private EgovIdGnrService idgenService;
	
	

	//임시데이터 등록하기
	public String insertTemp(BoardVO vo) throws Exception{
		String id = idgenService.getNextStringId();
		vo.setTempId(id);
		boardDAO.insertTemp(vo);
			
		return id;
	}
	
	//임시데이터 목록 가져오기
	public List<EgovMap> selectTempList(BoardVO vo) throws Exception{
		return boardDAO.selectTempList(vo);
	}
	
	//임시데이터 목록 수
	public int selectTempListCnt(BoardVO vo) throws Exception{
		return boardDAO.selectTempListCnt(vo);
	}
	
	//임시데이터 상세
	public BoardVO selectTemp(BoardVO vo) throws Exception{
		return boardDAO.selectTemp(vo);
	}
	
	//임시데이터 수정하기
	public void updateTemp(BoardVO vo) throws Exception{
	    boardDAO.updateTemp(vo);	  
	}
	//임시데이터 삭제
	public void deleteTemp(BoardVO vo) throws Exception{
	    boardDAO.deleteTemp(vo);	  
			}
}
