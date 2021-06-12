<%@ taglib prefix="bb" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<style>
*{
margin:0px;
}
h2{
color:white;
background-color:red;
line-height:50px;
margin-bottom:20px;
}
</style>
<head>
<meta charset="ISO-8859-1">
<title>C 1018471 Bhaskar Singh Bisht (Class Rollno-17)</title>
</head>
<body>

<center>
<h2>C 1018471 Bhaskar Singh Bisht</h2>
 <bb:form action="checkinfo" method="post">
 <bb:textfield name="name" size="30" label="Enter your UserName"/>
 <bb:textfield name="age" size="25" label="Enter your Password"/>
 <bb:submit    name="submit" label="Submit" align="left"/>
 </bb:form>
</center>


</body>
</html> 