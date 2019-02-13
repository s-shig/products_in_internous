<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>トップページ</title>
<link rel="stylesheet" type="text/css" href="/myblog/css/style.css">
</head>
<body>
<jsp:include page="/header.jsp"/>
<h1>トップメニュー</h1>
<div class="login">
<a href= "/myblog/login.jsp"><img alt="ログイン" src="/myblog/img/key1.jpeg"></a>
<p><a href= "/myblog/login.jsp" style="text-decoration:none">ログイン</a></p>
</div>
<div class="regist">
<a href="/myblog/regist.jsp"><img alt="ログイン" src="/myblog/img/key2.jpeg"></a>
<p><a href="/myblog/regist.jsp" style="text-decoration:none">登録</a></p>
</div>
</body>
</html>