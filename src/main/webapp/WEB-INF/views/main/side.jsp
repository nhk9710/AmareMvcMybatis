<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
	request.setCharacterEncoding("UTF-8");
%> 
<c:set var="contextPath" value="${pageContext.request.contextPath}" />    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사이드 메뉴</title>
<link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" rel="stylesheet" >
<style type="text/css">
	.no-underline {
		text-decoration: none;
	}
</style>
</head>
<body>
	<h2 style="color:white;">Info</h2>
	<br/><br/>
	<h4>
		<a href="${contextPath}/board/listBoards.do" class="no-underline">문의게시판</a><br/><br/>
		<a href="${contextPath}/board/shelter_location.do" class="no-underline">보호소 위치</a><br/><br/>
		<a href="${contextPath}/board/faqPage.do" class="no-underline">FAQ</a><br/><br/>
	</h4>
</body>
</html>