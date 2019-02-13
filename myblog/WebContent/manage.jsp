<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>管理画面</title>
<link rel="stylesheet" type="text/css" href="/myblog/css/style.css">
</head>
<body>
<jsp:include page="/header.jsp"/>
	<h1>管理画面</h1>

	<form action="/myblog/PostColumServlet" method="get">
	<input type="image" alt="記事投稿" src="/myblog/img/pen.jpeg">
		<p><button type="submit">記事投稿</button></p>
	</form>

	<form action="/myblog/ColumListServlet" method="post">
	<input type="image" alt="記事一覧" src="/myblog/img/list.jpeg">
		<p><button type="submit">記事一覧</button></p>
	</form>

</body>
</html>