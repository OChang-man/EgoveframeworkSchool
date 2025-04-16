package egovframework.let.temp.service;

import java.util.List;

import org.egovframe.rte.psl.dataaccess.util.EgovMap;

public interface TempService {
	
	//임시데이터 가져오기
	public TempVO selectTemp(TempVO vo) throws Exception;
	
	//임시데이터 가져오기
	public List<EgovMap> selectTempList(TempVO vo) throws Exception;
	
	//임시데이터 가져오기
	public int selectTempListCnt(TempVO vo) throws Exception;
	
	//임시데이터 등록
	public String insertTemp(TempVO vo) throws Exception;
		
	//임시데이터 수정
	public void updateTemp(TempVO vo) throws Exception;
	
	//임시데이터 삭제
	public void deleteTemp(TempVO vo) throws Exception;
}
