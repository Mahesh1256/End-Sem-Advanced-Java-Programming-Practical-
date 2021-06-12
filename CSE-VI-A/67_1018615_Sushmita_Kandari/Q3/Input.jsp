<%@ taglib prefix="s" uri="/struts-tags"  %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SUSHMITA KANDARI</title>
</head>
<body>
	<s:form action="userinfo" method="post">
			<s:textfield  name="name" size="20" label="Enter UserName"/>
			<s:input type="text" name="password" size="15" label="Enter Password"/>
			<s:submit name="submit" label="Submit" align="center"/>
		</s:form>
</body>
</html>