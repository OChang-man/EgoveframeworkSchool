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
<c:choose>
	<c:when test="${not empty resulte.tempId}">
		<c:set var="actionUrl" value="/temp2/update.do"/>
	</c:when>
	<c:otherwise>
		<c:set var="actionUrl" value="/temp2/insert.do"/>
	</c:otherwise>
</c:choose>

* 등록품
<form action="${actionUrl}" method="post" name="tempVO">
	<input type="hidden" name="tempId" value="${reult.tempId}"/>
	<label for="tempVal">값 정보 : </label>
	<input type="text" id="tempVal" name="tempVal" value="${result.tempVal}"/>
	<br/>
	<c:choose>
		<c:when test="${not empty resulte.tempId}">
			<button type="submit">수정</button>
		</c:when>
		<c:otherwise>
			<button type="submit">등록</button>
		</c:otherwise>
	</c:choose>

</form>

</body>
</html>

