 <%@ taglib prefix="s" uri="/struts-tags"  %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Input Page</title>
</head>
<body>
	<s:form action="empinfo" method="post">
			<s:textfield  name="name" size="20" label="USER"/>
			<s:textfield  name="password" size="20" label="PASSWORD"/>
			<s:submit name="submit" label="Submit" align="center"/>
		</s:form>
</body>
</html>