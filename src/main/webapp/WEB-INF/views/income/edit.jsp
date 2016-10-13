


<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<form:form action="/income/edit" method="post" modelAttribute="income">
    <form:hidden path="idIncome"/>
    <form:input path="Main income"/>
    <form:input path="Royalty"/>
    <form:input path="Income of sale of property"/>
    <form:input path="income from gifts"/>
    <form:input path="Transfers from abroad"/>
    <form:input path="Benefits for children"/>
    <form:input path="Financial aid"/>

    <form:button>Edit</form:button>
    </form:form>
