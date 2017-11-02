<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<title>Counter</title>
</head>
<body>
	<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
	<div class="container">
		<div class="row">
			<div class="col-md-12 text-center">
			<br>
			<br>
			<p>You have visited: localhost:8080 <c:out value="${count}"/> times</p>
			<p><a href="/">Test another visit?</a></p>
			</div>
		</div>
	</div>
</body>
</html>