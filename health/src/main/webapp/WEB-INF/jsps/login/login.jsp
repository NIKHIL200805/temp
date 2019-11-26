<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>LOGIN PAGE</title>
</head>

<body>
<center>
<form action= "login" method ="post"/>
<pre>
name:<input type="text" name="name"/>
gender:<input type="text" name="gender"/>
<input type="submit" value="login"/>

${msg }

</pre>




</form>
</center>
</body>
</html>