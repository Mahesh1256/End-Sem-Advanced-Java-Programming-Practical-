<?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns="http://xmlns.jcp.org/xml/ns/javaee" xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee http://xmlns.jcp.org/xml/ns/javaee/web-app_4_0.xsd" id="WebApp_ID" version="4.0">
  <display-name>Practical12</display-name>
 <welcome-file-list>
 <welcome-file>Input.jsp</welcome-file>
 <welcome-file>default.html</welcome-file>
 </welcome-file-list>

 <filter>
 <filter-name>struts2</filter-name>
 <filterclass>org.apache.struts2.dispatcher.ng.filter.StrutsPrepareAndExecuteFilter</filter-class>
 </filter>

 <filter-mapping>
 <filter-name>struts2</filter-name>
 <url-pattern>/*</url-pattern>
 </filter-mapping>
</web-app>
