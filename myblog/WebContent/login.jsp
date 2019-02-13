<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ログイン画面</title>
<link rel="stylesheet" type="text/css" href="/myblog/css/style.css">
</head>
<body>
<jsp:include page="/header.jsp"/>
<h1>Login</h1>
<form action="/myblog/LoginServlet" method="post">
<p>ユーザーID：<input type="text" name="id"></p>
<p>パスワード：<input type="password" name="password"></p>
<input type="submit" value="ログイン">
<input type="reset" value="リセット">
</form>
<%
    String error = (String)request.getAttribute("error");
if (error != null) {
%>
	<p class="error"><%=error%></p>
	<% } %>
<p><a href = "./manage.jsp" style="text-decoration:none">戻る</a></p>
</body>
</html>