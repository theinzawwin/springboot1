<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c"		uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form"	uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Student</title>
</head>
<body>
<h3>Student Registration</h3>
<form:form action="new_student.htm" method="post" modelAttribute="student">
	Name: <form:input path="name"/> <br>
	Phone: <form:input path="phone"/><br>
	<input type="submit" value="Save" />
</form:form>
</body>
</html>