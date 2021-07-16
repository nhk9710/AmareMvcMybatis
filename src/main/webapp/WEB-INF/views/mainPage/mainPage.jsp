<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>아마레 펫츠</title>
	<link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/resources/css/kfonts2.css" rel="stylesheet">
	<style type="text/css">
		*{
			box-sizing: border-box;
			-webkit-box-sizing: border-box;
			-moz-box-sizing: border-box;
		}
		html {
			height: 100%;
		}
	
		body {
			margin: 0;
			height: 100%;
		}
		
		.wrap {
		min-height: 100%;
		position: relative;
		padding-bottom:19px;
		}
		.footer {
			height: 100px;
			width: 100%;
			position: absolute;
			bottom: 0;
			text-align: center;
		}
	</style>
</head>
<body>
<div class="wrap">
	<jsp:include page="../main/menu.jsp" />
	
	<%
		String d_animals = "총 사망한 동물 수";
		String d_dogs = "총 사망한 강아지 수";
		String d_cats = "총 사망한 고양이 수";
		String insert_animals = "등록된 유기 동물 수";
	%>
	
	
		<div class="container" >
			<p><%=d_animals%></p>
			<p><%=d_dogs%></p>
			<p><%=d_cats%></p>
			<p><%=insert_animals%></p>
		</div>
	
	<div class="container">
		<div class="text-left">
		<h3>DOG</h3>
		</div>
		<div>
		<p>asdfadf</p>
		</div>
	</div>
	
	<div class="container">
		<div class="text-left">
		<h3>CAT</h3>
		</div>
		<div>
		<p>asdfadf</p>
		</div>
	</div>

	<footer class="footer">
		<jsp:include page="../main/footer.jsp" />
	</footer>
	</div>
</body>

</html>