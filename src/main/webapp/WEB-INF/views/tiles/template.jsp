<%--
  Created by IntelliJ IDEA.
  User: Леся Гопшта
  Date: 27.07.2016
  Time: 12:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<html>
<head>
    <title>Title</title>
    <style>
         span{
             color: red;
            }
            </style>
</head>
<body>
    <div> <tiles:insertAttribute name="header"/> </div>
    <div> <tiles:insertAttribute name="menu"/></div>
    <div> <tiles:insertAttribute name="body"/></div>
    <div> <tiles:insertAttribute name="footer"/></div>
</body>
</html>
