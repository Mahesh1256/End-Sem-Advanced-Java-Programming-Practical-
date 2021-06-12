<%@ taglib prefix="p" uri="/struts-tags"  %>
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
		<p:form action="calculateSumAction" method="post">
			<p:textfield  name="x" size="10" label="Enter X"/>
			<p:textfield  name="y" size="10" label="Enter Y"/>
			<p:submit value="Calculate"/>
		</p:form>
	</center>
</body>
</html>