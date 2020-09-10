<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Spring Web App Demonstration</title>
</head>
<body>

<c:if test="${not empty list}">
    <c:forEach items="${list}" var="list">
       ${list}
</c:forEach>
</c:if>
	
	${human}	

</body>
</html>