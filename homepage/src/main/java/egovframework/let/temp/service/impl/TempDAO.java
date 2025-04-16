package egovframework.let.temp.service.impl;

import java.util.List;

import org.egovframe.rte.psl.dataaccess.EgovAbstractMapper;
import org.egovframe.rte.psl.dataaccess.util.EgovMap;
import org.springframework.stereotype.Repository;

import egovframework.let.temp.service.TempVO;

@Repository("tempDAO")/*impl과 연결되는 부분*/
public class TempDAO extends EgovAbstractMapper{
	
	//임시데이터 가져오기
	public TempVO selectTemp(TempVO vo) throws Exception{
		return selectOne("tempDAO.selectTemp",vo); /*SQL과 연결되는 부분*/
	}
	
	//임시데이터 가져오기
	public List<EgovMap> selectTempList(TempVO vo) throws Exception{
		return selectList("tempDAO.selectTempList",vo); /*SQL과 연결되는 부분*/
	}
	
	//임시데이터 목록 수
	public int selectTempListCnt(TempVO vo) throws Exception{
		return selectOne("tempDAO.selectTempListCnt",vo); /*SQL과 연결되는 부분*/
	}
	//임시데이터 등록
	public void insertTemp(TempVO vo) throws Exception{
		insert("tempDAO.insertTemp",vo); /*SQL과 연결되는 부분*/
	}
	//임시데이터 수정
	public void updateTemp(TempVO vo) throws Exception{
		update("tempDAO.updateTemp",vo); /*SQL과 연결되는 부분*/
	}
	//임시데이터 삭제
	public void deleteTemp(TempVO vo) throws Exception{
		delete("tempDAO.deleteTemp",vo); /*SQL과 연결되는 부분*/
	}
}
