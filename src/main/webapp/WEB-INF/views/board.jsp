<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/board" method="get">
		<table border="1">
			<tr>
				<td>번호</td><td>제목</td><td>작성자</td>
			</tr>
			<c:forEach var="vo" items="${list }">
			<tr>
				<td>${vo.cnt}</td>
				<td><a href="#">${vo.title }</a></td>
				<td>${vo.writer }</td>
			</tr>
			</c:forEach>
		</table>
	</form>
</body>
</html>