<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<style>  
.footer {  
position: fixed;  
left: 10px;  
bottom: 25px;  
right: 10px;   
width: 95%;  
background-color: pink;  
color: black;  
text-align: center;  
}  
</style>
</head>
<body>

<h1>User Login Page</h1>

<s:form action="FormInformation" method="post">

<s:textfield name="Name" label="Enter UserName" size="20"></s:textfield>
<s:textfield name="Age" label="Enter Age" size="20"></s:textfield>

<s:submit name="Submit" label="Submit" align="center"></s:submit>



</s:form>
<div class="footer">  
ShubhamPathaniya_1018603_62_Sec-B_VI-Sem.
</div>
</body>
</html>