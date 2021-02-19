<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

	<h1>Students List</h1>
	<table border="2" width="70%" cellpadding="2">
	<tr><th>Id</th><th>Name</th><th>AGe</th><th>Edit</th><th>Delete</th></tr>
    <c:forEach var="std" items="${list}"> 
    <tr>
    <td>${std.id}</td>
    <td>${std.name}</td>
    <td>${std.age}</td>
    <td><a href="editStd/${std.id}">Edit</a></td>
    <td><a href="deleteStd/${std.id}">Delete</a></td>
    </tr>
    </c:forEach>
    </table>
    <br/>
    <a href="studentForm">Add New Student</a>