<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.ArrayList" %>
<%@ page import="dto.BlogDto" %>
<% ArrayList<String> list = (ArrayList<String>)request.getAttribute("list"); %>
<% ArrayList<Integer> nolist = (ArrayList<Integer>)request.getAttribute("nolist"); %>
<% String userName = (String)session.getAttribute("id"); %>
<%@ page session="true" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>記事一覧</title>
<link rel="stylesheet" type="text/css" href="/myblog/css/style.css">
</head>
<body>
<jsp:include page="/header.jsp"/>
<h1>記事一覧</h1>
<p><%= userName %>さんの投稿記事一覧</p><br>
<% for (int i=list.size()-1; i>=0;i--) { %>
<p class="list"><%= list.get(i) %></p>
<p class="no"><%= nolist.get(i) %></p>
<form class="columlist" action="/myblog/EditServlet" method="post">
<input type="hidden" name="bfcolum" value="<%= list.get(i) %>">
<input type="hidden" name="no" value="<%= nolist.get(i) %>">
<button type="submit">編集</button>
</form>

<form class="columlist" action="/myblog/DeleteServlet" method="post">
<input type="hidden" name="no" value="<%= nolist.get(i) %>">
<button type="submit">削除</button>
</form>

<% } %>
<p><a href = "./manage.jsp" style="text-decoration:none">戻る</a></p>
</body>
</html>