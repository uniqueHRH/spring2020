<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" pageEncoding="utf-8"%>
<html>
<head>
	<meta charset="utf-8"> 
	<title>Home</title>
	<script type="text/javascript" src="resources/js/jquery-1.12.4.js"></script>
	<script type="text/javascript">
		$(function(){
			$('form button[type=button]').click(function(){
					$('<input type="file" name="files" />').appendTo("form>div:eq(1)");
				});
			});
	</script>
</head>
<body>
<h1>
	Hello world!  
</h1>
<!-- 주소에 사용할 수 없는 "?" 같은 것들이 들어갈 수 있기 때문에, POST 로 사용한다 -->
<!-- enctype
	디폴트 : application/x-www-form-urlencoded / mothod 가 POST 일 때만 사용 가능
		- application/x-www-form-urlencoded : 기본값으로, 모든 문자들은 서버로 보내기 전에 인코딩됨을 명시
		- multipart/form-data : 모든 문자를 인코딩하지 않음을 명시
							<form> 요소가 파일이나 이미지를 서버로 전송할 때 주로 사용
		- text/plain : 공백 문자(space)는 "+" 기호로 변환하지만, 나머지 문자는 모두 인코딩되지 않음을 명시
 -->
	<form action="upload" method="post" enctype="multipart/form-data">
		<div>
			<label for="sabun">sabun</label>
			<input type="text" name="sabun" />
		</div>
		<div>
			<label for="file1">file1</label>
			<input type="file" name="files" />
		</div>
		<button type="button">첨부추가</button>
		<button type="submit">업로드</button>
	</form>
</body>
</html>