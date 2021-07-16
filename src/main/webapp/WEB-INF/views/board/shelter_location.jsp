<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>보호소 위치 </title>
<link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/resources/css/shelterLocation.css" rel="stylesheet">
</head>
<body>
<header class="header">
<jsp:include page="../main/menu.jsp" />
<h1>보호소 위치</h1>
</header>

<div class="wrap">
<div class="row">
<div class="col-md-3">
	<ul class="menu" id="faqul">
	<h2 style="color: white;">Info 목록</h2>
		<li id="faqli1">
		<a href="faqPage.jsp">FAQ</a>
		</li>
		<li id="faqli1">
		<a href="questionBoard.jsp">문의하기</a>
		</li>
		<li id="faqli1">
		<a href="shelter_location.jsp">보호소 위치</a>
		</li>
		<li id="faqli1">
		<a href="${pageContext.request.contextPath}/bds.do?action=listBoards">문의게시판</a>
		</li>
	</ul>
</div>
	
	<form>
	<select name="sido1" id="sido1"></select>
	<select name="gugun1" id="gugun1"></select>
	</form>

</div>


	<script src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
	<script src="${pageContext.request.contextPath}/resources/js/shelterLocation.js"></script>
	<footer class="footer">
		<jsp:include page="../main/footer.jsp" />
	</footer>
</div>
</body>
</html>