<%--
  Created by IntelliJ IDEA.
  User: Леся Гопшта
  Date: 01.08.2016
  Time: 15:58
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<form:form action="/registration" method="post" modelAttribute="user">
   <form:errors path="name"/>
    <form:input path="name"/>

    <form:errors path="surname"/>
    <form:input path="surname"/>

    <form:errors path="email"/>
    <form:input path= "email"/>

    <form:errors path="phone"/>
    <form:input path="phone"/>

    <form:errors path="password"/>
    <form:input path="password"/>

 <form:errors path="password"/>
 <form:input path="passwordConfirm"/>

    <form:button>Sign up!</form:button>
    </form:form>
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<div id="templatemo_main">
    <div style=" height: 120%;">
        <div style="font-size: 16px; text-align: center; width: 280px; height: auto; background-color: #999999; color: white; float: inherit;position: absolute;left:41%; margin: 0px; border: 3px double black; border-radius: 0px;">

            <form:form action="/registration" method="post" modelAttribute="user">
                <p>Name</p>
                <form:errors path="name"/>
                <form:input path="name"/>
                <p>Surname</p>
                <form:errors path="surname"/>
                <form:input path="surname"/>
                <p>Mobile</p>
                <form:errors path="phone"/>
                <form:input  path="phone"/>
                <p>Password</p>
                <form:errors path="password"/>
                <form:password path="password"/>
                <p>Repeat password</p>
                <form:errors path="password"/>
                <form:password path="passwordConfirm"/>
                <p><form:button>Sign up!</form:button></p>
            </form:form>
        </div>
    </div>
</div>