package egovframework.let.template.web;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.egovframe.rte.fdl.string.EgovStringUtil;
import org.egovframe.rte.psl.dataaccess.util.EgovMap;
import org.egovframe.rte.ptl.mvc.tags.ui.pagination.PaginationInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import egovframework.com.cmm.LoginVO;
import egovframework.com.cmm.util.EgovUserDetailsHelper;
import egovframework.let.temp.service.TempService;
import egovframework.let.temp.service.TempVO;
import egovframework.let.temp2.service.Temp2Service;
import egovframework.let.temp2.service.Temp2VO;

@Controller
public class TemplateController {

	//헤더
	@RequestMapping(value = "/template/header.do")
	public String header(HttpServletRequest request, ModelMap model) throws Exception{
		
		LoginVO user = (LoginVO)EgovUserDetailsHelper.getAuthenticatedUser();
		model.addAttribute("USER_INFO", user);
		
		return "template/Header";		
	}
	
	//푸터
	@RequestMapping(value = "/template/footer.do")
	public String footer(HttpServletRequest request, ModelMap model) throws Exception{
		
		return "/template/Footer";
	}
}
