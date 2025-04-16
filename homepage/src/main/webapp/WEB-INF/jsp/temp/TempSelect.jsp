<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="ui" uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Language" content="ko" >
<title>데이터 가져오기</title>
</head>
<body>
${result.tempId} : ${result.tempVal} <!--controller와 연결되는 부분-->

<div class="box-btn">
	<c:url var="uptUrl" value="/temp/tempRegist.do">
		<c:param name="tempId" value="${temp.tempId}"/>
	</c:url>
	<a href="${uptUrl}">수정</a>
	
	<c:url var="delUrl" value="/temp/delete.do">
		<c:param name="tempId" value="${temp.tempId}"/>
	</c:url>
	<a href="${delUrl}" class="btn-del">삭제</a>
	
	<a href="/temp/selectList.do">목록</a>
</div>

</body>
</html>
<!--브라우저 확인 URL : http://localhost:2025/temp/select.do/tempId=1 -->