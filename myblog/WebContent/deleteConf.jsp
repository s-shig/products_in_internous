<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>削除確認</title>
<link rel="stylesheet" type="text/css" href="/myblog/css/style.css">
</head>
<body>
<jsp:include page="/header.jsp"/>

<p>削除してよろしいですか？</p>
<form class="columlist" action="/myblog/DeleteConfServlet" method="post">
<button type="submit">はい</button>
</form>
<form class="columlist" action="/myblog/BackManageServlet" method="get">
<button type="submit">いいえ</button>
</form>
</body>
</html>