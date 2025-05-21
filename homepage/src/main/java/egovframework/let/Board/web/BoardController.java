package egovframework.let.Board.web;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.egovframe.rte.fdl.string.EgovStringUtil;
import org.egovframe.rte.psl.dataaccess.util.EgovMap;
import org.egovframe.rte.ptl.mvc.tags.ui.pagination.PaginationInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import egovframework.let.temp.service.TempService;
import egovframework.let.temp.service.TempVO;
import egovframework.let.temp2.service.Temp2Service;
import egovframework.let.temp2.service.Temp2VO;

@Controller
public class BoardController {

	@Resource(name = "BoardService")
	private BoardService BoardService;
	
	//임시데이터 목록 가져오기
	@RequestMapping(value = "/Board/selectList.do")
	public String selectList(BoardVO boardVO, HttpServletRequest request, ModelMap model) throws Exception{
		
		PaginationInfo paginationInfo = new PaginationInfo();
		
		paginationInfo.setCurrentPageNo(boardVO.getPageIndex());
		paginationInfo.setRecordCountPerPage(boardVO.getPageUnit());
		paginationInfo.setPageSize(boardVO.getPageSize());
		
		boardVO.setFirstIndex(paginationInfo.getFirstRecordIndex());
		boardVO.setLastIndex(paginationInfo.getLastRecordIndex());
		boardVO.setRecordCountPerPage(paginationInfo.getRecordCountPerPage());
		
		List<EgovMap> resultList = boardService.selectTempList(boardVO);
		model.addAttribute("resultList", resultList);
		
		int totCnt = boardService.selectTempListCnt(boardVO);
		
		paginationInfo.setTotalRecordCount(totCnt);
		model.addAttribute("paginationInfo", paginationInfo);
		
		model.addAttribute("totCnt", totCnt);
		
		return "board/BoardSelectList";		
	}
	
	//임시데이터 등록/수정
	@RequestMapping(value = "/board/tempRegist.do")
	public String tempRegist(BoardVO boardVO, HttpServletRequest request, ModelMap model) throws Exception{
		BoardVO result = new BoardVO();
		if(!EgovStringUtil.isEmpty(boardVO.getTempId())) {
			result = boardService.selectTemp(boardVO);
		}
		model.addAttribute("result", result);
		
		return "board/BoardRegist";
	}
	
	//임시테이터 등록하기
	@RequestMapping(value = "/board/insert.do")
	public String insert(BoardVO boardVO, HttpServletRequest request, ModelMap model) throws Exception{
		boardService.insertTemp(boardVO);
		return "forward:/board/selsecList.do";
	}
	
	//임시데이터 수정하기
	@RequestMapping(value = "/board/update.do")
	public String update(BoardVO boardVO, HttpServletRequest request, ModelMap model) throws Exception{
		boardService.updateTemp(boardVO);
		return "forward:/board/selectList.do";
	}
	
	//임시데이터 가져오기
	@RequestMapping(value = "/board/select.do")
	public String select(BoardVO boardVO, HttpServletRequest request, ModelMap model) throws Exception{
		BoardVO result = boardService.selectTemp(boardVO);
		model.addAttribute("result", result);
		return "board/BoardSelect";
	}
	
	//임시데이터 삭제하기
	@RequestMapping(value = "/board/delete.do")
	public String delete(BoardVO boardVO, HttpServletRequest request, ModelMap model) throws Exception{
		boardService.deleteTemp(boardVO);
		return "forward:/board/TempSelect.do";
	}
}
