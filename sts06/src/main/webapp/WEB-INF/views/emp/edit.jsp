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
	<h1>Edit page</h1>
	<form method="POST">
		<div>
			<label for="sabun"></label>
			<input type="text" name="sabun" id="sabun" value="${bean.sabun }" readonly/>
		</div>
		<div>
			<label for="name"></label>
			<input type="text" name="name" id="name"value="${bean.name }" />
		</div>
		<div>
			<label for="nalja"></label>
			<input type="text" name="nalja"  id="nalja" value="${bean.nalja }" disabled/>
		</div>
		<div>
			<label for="pay"></label>
			<input type="text" name="pay"  id="pay"value="${bean.pay }" />
		</div>
		<div>
			<button>수 정</button>
		</div>
	</form>
</body>
</html>