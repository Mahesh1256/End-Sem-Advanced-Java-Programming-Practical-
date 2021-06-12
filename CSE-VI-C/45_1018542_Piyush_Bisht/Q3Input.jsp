<%--

  Name: Piyush Bisht
  Section:C
  RollNo:1018542
  Date: 12-06-2021
  Time: 09:17

--%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>User Login </title>
  </head>
  <body>
  <h1>Login Here</h1>
  <s:form action="login" method="POST">
    <s:textfield name="username" label="Enter Username "></s:textfield>
    <s:textfield name="password" label="Enter Password "></s:textfield>
    <s:submit value="Login Here"></s:submit>
  </s:form>
  </body>
</html>
