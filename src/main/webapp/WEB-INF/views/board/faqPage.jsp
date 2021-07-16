<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>자주하는 질문</title>
<link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/resources/css/faqPage.css" rel="stylesheet">
</head>
<body>
<header class="header">
<jsp:include page="../main/menu.jsp" />
<h1>자주하는 질문 FAQ</h1>
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
<div class="col-md-9 cont">
	<div class="row">
	<div class="col-md-9">
	<div class="accordion" id="accordionExample">
  <div class="card">
    <div class="card-header" id="headingOne">
      <h2 class="mb-0">
        <button class="btn btn-link btn-block text-left" type="button" data-toggle="collapse" data-target="#collapseOne" aria-expanded="true" aria-controls="collapseOne">
         <h4>
          자주 묻는 질문 #1
        </h4>
        </button>
      </h2>
    </div>

    <div id="collapseOne" class="collapse" aria-labelledby="headingOne" data-parent="#accordionExample">
      <div class="card-body">
      <h4>
          자주 묻는 질문 답변 #1
        </h4>
      </div>
    </div>
  </div>
  <div class="card">
    <div class="card-header" id="headingTwo">
      <h2 class="mb-0">
        <button class="btn btn-link btn-block text-left collapsed" type="button" data-toggle="collapse" data-target="#collapseTwo" aria-expanded="false" aria-controls="collapseTwo">
          <h4>
          자주 묻는 질문 #2
        </h4>
        </button>
      </h2>
    </div>
    <div id="collapseTwo" class="collapse" aria-labelledby="headingTwo" data-parent="#accordionExample">
      <div class="card-body">
         <h4>
          자주 묻는 질문 답변 #2
        </h4>
      </div>
    </div>
  </div>
  <div class="card">
    <div class="card-header" id="headingThree">
      <h2 class="mb-0">
        <button class="btn btn-link btn-block text-left collapsed" type="button" data-toggle="collapse" data-target="#collapseThree" aria-expanded="false" aria-controls="collapseThree">
         <h4>
          자주 묻는 질문 #3
        </h4>
        </button>
      </h2>
    </div>
    <div id="collapseThree" class="collapse" aria-labelledby="headingThree" data-parent="#accordionExample">
      <div class="card-body">
         <h4>
          자주 묻는 질문 답변 #3
        </h4>
      </div>
    </div>
  </div>
</div>
</div>
</div>
</div>
</div>


<script src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
<footer class="footer">
		<jsp:include page="../main/footer.jsp" />
	</footer>
</div>
</body>
</html>