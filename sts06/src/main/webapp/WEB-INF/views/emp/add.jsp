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
	<h1>Add page</h1>
	<form method="POST">
		<div>
			<label for="name"></label>
			<input type="text" name="name" id="name"/>
		</div>
		<div>
			<label for="pay"></label>
			<input type="text" name="pay"  id="pay"/>
		</div>
		<div>
			<button>입 력</button>
		</div>
	</form>
</body>
</html>