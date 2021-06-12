<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
</head>
<body>
	<center>
	<s:form action="loginAction" method="post">
		<s:textfield size="15" name="x" label="user name" /><br>
		<s:textfield size="10" name="y" label="password" /><br>
		<s:submit value="login"/>
	</s:form>
	</center>
</body>
</html>