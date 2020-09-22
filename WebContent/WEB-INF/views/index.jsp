<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>collection</title>
</head>
<body>

	<h1>Spring Display Collection</h1>
	<br>
	
	<h2>Display List</h2>
	<c:if test="${not empty list }">
		<ul>
			<c:forEach items="${list }" var="item">
				<li> ${item.id } - ${item.name } - ${item.address } </li>			
			</c:forEach>
		</ul>
	</c:if>

	<h2>Display Set</h2>
	<c:if test="${not empty set }">
		<ul>
			<c:forEach items="${set }" var="item">
				<li> ${item.id } - ${item.name } - ${item.address } </li>
			</c:forEach>
		</ul>
	</c:if>
	
	<h2>Display Map</h2>
	<c:if test="${not empty map }">
		<ul>
			<c:forEach items="${map }" var="item">
				<li> ${item.key } | ${item.value.id } - ${item.value.name } - ${item.value.address } </li>
			</c:forEach>
		</ul>
	</c:if>
</body>
</html>