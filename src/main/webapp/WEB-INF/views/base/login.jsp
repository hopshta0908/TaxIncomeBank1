<%--
  Created by IntelliJ IDEA.
  User: Леся Гопшта
  Date: 01.08.2016
  Time: 15:53
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<form:form action="/loginprocessing" method="post">
    <input name="username" type="text" placeholder="login">
    <input name="password" type="password" placeholder="password">
    <input type="submit" value="Sign in">
</form:form>--%>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<div style=" height: 90%;">
    <div id="templatemo_main">
        <div style="font-size: 16px; text-align: center; width: 300px; height: 126px; background-color: #999999; color: white; float: inherit;position: absolute;left:36%; margin: 22px; border: 3px double black; border-radius: 0px;">
            <form:form action="/loginprocessing" method="post">
                <p><input name="username" type="text" placeholder="Login"></p>
                <p><input name="password" type="password" placeholder="Password"></p>
                <p><input type="submit" value="Sign in"></p>
            </form:form>
        </div>
    </div>
</div>