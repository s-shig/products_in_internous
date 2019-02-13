<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<% String bfcolum = (String)session.getAttribute("bfcolum"); %>
	<%@ page session="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>編集画面</title>
<link rel="stylesheet" type="text/css" href="/myblog/css/style.css">
</head>
<body>
<jsp:include page="/header.jsp"/>
	<form action="/myblog/EditCompServlet" method="post">
		<textarea name="afcolum" rows="10" cols="40"><%= bfcolum %></textarea>
		<input type="submit" value="編集">
	</form>
	<p><a href = "./manage.jsp" style="text-decoration:none">戻る</a></p>
</body>
</html>