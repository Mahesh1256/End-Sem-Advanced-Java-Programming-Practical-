<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>struts</title>
</head>
<body>
 	<center>
 		<h2>Calculate sum of two numbers</h2>
 		<s:form action="calculateSumAction" method="post">
 		<s:textfield name="x" size="10" label="Enter X"/>
 		<s:textfield name="y" size="10" label="Enter Y"/>
 		<s:submit value="Calculate"/>
 		</s:form>
 	</center>
</body>
</html>
