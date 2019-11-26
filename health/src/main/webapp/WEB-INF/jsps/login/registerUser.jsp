<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<center>
<h1>Registration Form</h1>

<body>
<form action="registerUser" method="post">

<table>
<tr>
<td>id</td>
<td>:</td>
<td><input type="text" name="id"/></td>
</tr>
<tr>
<td>name</td>
<td>:</td>
<td><input type="text" name="name"/></td>
</tr>
<tr>


<tr>
<td>gender</td>
<td>:</td>
<td><input type="text" name="gender"/></td>
</tr>
<tr>
<td>mailid</td>
<td>:</td>
<td><input type="text" name="mailid"/></td>
</tr>


</table>
<tr>
<td><input type="submit" value="Submit"/></td>
<td><input type ="submit" value="login" src="login.jsp"/></td>
</tr>
</center>


 </form>
</body>
</html>