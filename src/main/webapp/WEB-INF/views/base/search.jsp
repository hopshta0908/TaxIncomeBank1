<%--
  Created by IntelliJ IDEA.
  User: Леся Гопшта
  Date: 11.10.2016
  Time: 20:03
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<form:form id="searchbox" action="/searchh" method="post">
    <p><input id="search" name="bankName" type="text" placeholder="..."></p>
    <p><input id="submit" type="submit" value="Шукати"></p>
</form:form>
