<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Input here</title>
</head>
<body>
 <s:form action="valid" method="post">
 <s:textfield name="username" size="25" label="username"/>
 <s:textfield name="pass" size="20" label="Password"/>
 <s:submit name="submit" label="Submit" align="center"/>
 </s:form>
</body>
</html> 