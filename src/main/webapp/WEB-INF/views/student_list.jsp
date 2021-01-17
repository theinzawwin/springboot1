<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c"		uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form"	uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student List</title>
</head>
<body>
<h3>Student List</h3>
<table>
	<thead>
	<tr>
		<th>No</th>
		<th>Name</th>
		<th>Phone</th>
	</tr>
	</thead>
	<tbody>
		<c:forEach items="${studentList}" var="std" varStatus="row">
			<tr>
				<td>${row.count }</td>
				<td>${std.name }</td>
				<td>${std.phone}</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
</body>
</html>