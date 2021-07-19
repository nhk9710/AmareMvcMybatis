<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<c:set var="contextPath" value="${pageContext.request.contextPath}" />   
<%
	request.setCharacterEncoding("UTF-8");
%>    
<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
	<link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" rel="stylesheet" >
	<link href="${pageContext.request.contextPath}/resources/css/kfonts2.css" rel="stylesheet" >
	<title>문의 사항</title>
	<script type="text/javascript" src="http://code.jquery.com/jquery-latest.min.js"></script>
	<style type="text/css">
		table{
		    width: 100%;
		    border-collapse: collapse;
		    line-height: 24px;
		}
		th {
		    border-top:1px solid black;
		    border-bottom:1px solid black;
		    border-collapse: collapse;
		    text-align: center;
		    padding: 13px;
		    background: rgb(221, 221, 221);
		}
		td{
			border-bottom: 1px solid gray;
			padding : 10px;
		}
	
	</style>
</head>
<body>

	
	<div id="container" style="margin-bottom: 20px; margin-top: 20p;">
	<div  class="jumbotron"><h2>문의사항</h2></div>
	<table class="table table-hover">
		<tr style="align: right;">
    			<td colspan="5" style="display:inline-block; border:white;">
    				<a href="${contextPath}/board/boardForm.do">문의 작성하기</a>
    			</td>
    		</tr>
		<tr>
			<th style="width:10%;"><b>번호</b></th>
			<th style="width:20%;"><b>아이디</b></th>
			<th style="width:50%;"><b>제목</b></th>
			<th style="width:10%;"><b>카테고리</b></th>
			<th style="width:10%;"><b>날짜</b></th>
		</tr>
		
		
		
		<c:forEach var="board" items="${boardsList }" >
			<tr align="center">
				<td>${board.qa_No }</td>
				<td>${board.user_id }</td>
				<td><a href="${contextPath}/board/viewBoard.do?qa_No=${board.qa_No}">${board.qa_title }</a></td>
				<td>${board.qa_category }</td>
				<td>${board.qa_date }</td>
			</tr>
		</c:forEach>
	</table>

</div>

</body>
</html>