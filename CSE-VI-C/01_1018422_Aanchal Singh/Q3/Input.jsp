<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Form</title>
</head>
<body>
	<s:form action="userInfo" method="post">
		<s:textfield name="name" size="20" label="Name " />
		<s:textfield name="pass" size="20" label="Password " />
		<s:submit name="submit" lable= "Submit" align="center" />
	</s:form>
</body>
</html>