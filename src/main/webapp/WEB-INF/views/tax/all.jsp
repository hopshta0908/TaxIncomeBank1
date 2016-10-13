<%--
  Created by IntelliJ IDEA.
  User: Леся Гопшта
  Date: 26.07.2016
  Time: 19:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>allRemixes</title>
</head>
<body>
<c:forEach items="${remixes}" var="r">
    <a href="/tax/page/${r.idRemix}">
    <div style="width:300px; height: 300px; background-color:bisque; color:fuchsia; float: left; margin: 10px;
        border: 3px double burlywood; border-radius: 50%">
        <p style="text-align: center;padding: 0 10px;font-size: 24pt;">${r.remixName}</p>
        <p style="text-align: center;padding: 0 10px;font-size: 24pt;">${r.remixQuantity}</p>

        <p style="text-align: center"><a href="/tax/edit/${r.idRemix}">EDIT</a></p>
        <p style="text-align: center"><form:form cssStyle="text-align: center" action="/tax/delete/${r.idRemix}"><button type="submit">DELETE</button></form:form></p>


    </div>
        </a>
</c:forEach>
<p style="clear: left; text-align: center"><sec:authorize access="hasRole('ADMIN')"><a href="/tax/new">Add new Remix</a></sec:authorize> </p>


</body>
</html>
