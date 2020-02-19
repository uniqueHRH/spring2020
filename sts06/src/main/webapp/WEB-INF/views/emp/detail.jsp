<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Detail page</h1>
	<div>
		<div>
			<span>sabun</span>
			<span>${bean.sabun }</span>
		</div>
		<div>
			<span>name</span>
			<span>${bean.name }</span>
		</div>
		<div>
			<span>nalja</span>
			<span>${bean.nalja }</span>
		</div>
		<div>
			<span>pay</span>
			<span>${bean.pay }</span>
		</div>
		<div>
			<a href="edit?idx=${bean.sabun }">수 정</a>
			<a href="delete?idx=${bean.sabun }">삭 제</a>
		</div>
	</div>
</body>
</html>