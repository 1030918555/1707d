<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<td>编号</td>
			<td>用户名</td>
			<td>密码</td>
		</tr>
		<c:forEach items="${list }" var="u" >
				<tr>
					<td>${u.id }</td>
					<td>${u.name }</td>
					<td>${u.pwd }</td>
				</tr>
		</c:forEach>
	</table>
</body>
</html>