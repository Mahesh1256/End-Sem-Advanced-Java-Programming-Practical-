<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sum</title>
</head>
<body>
<center>
<h2>Calculate Sum of two Numbers:</h2>
	<s:form action="calculateSumAction" method="post">
		<s:textfield size="10" name="x" label="Enter X" /><br>
		<s:textfield size="10" name="y" label="Enter Y" /><br>
		<s:submit value="Calculate"/>
	</s:form>
</center>
</body>
</html>