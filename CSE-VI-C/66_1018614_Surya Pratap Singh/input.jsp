/* Name= Surya Pratap Singh
   Roll Number: 66
   Section : C
   University Roll Number: 1018614 */

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Username and Password as Input</title>
</head>
<body>
<s:form action="user" method="post">
    <s:textfield name="name" size="20" label="Name"/>
    <s:textfield name="password" size="20" label="Password"/>
    <s:submit name="submit" label="Submit" align="center"/>
</s:form>
</body>
</html>