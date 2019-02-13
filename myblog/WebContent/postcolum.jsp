<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>記事投稿</title>
<link rel="stylesheet" type="text/css" href="/myblog/css/style.css">
</head>
<body>
<jsp:include page="/header.jsp"/>
<h1>記事投稿ページ</h1>
<form action="/myblog/PostColumServlet" method="post">
	<textarea name="colum" rows="10" cols="40" placeholder="投稿内容を書いてください"></textarea>
	<input type="submit" value="投稿">
</form>
<p><a href = "./manage.jsp" style="text-decoration:none">戻る</a></p>
</body>
</html>