<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <center>
 <h3>User Details</h3>
 <s:form action="empinfo" method="post">
 <s:textfield name="name" size="30" label="Name"/>
 <s:textfield name="email" size="30" label="email"/>
 <s:submit name="submit" label="Submit" align="center"/>
 </s:form>
 <br>
 <br><span>"@divyaPathak_1018480"</span>
 </center>
</body>
</html> 