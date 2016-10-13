<%--
  Created by IntelliJ IDEA.
  User: Леся Гопшта
  Date: 09.10.2016
  Time: 20:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title></title>
</head>
<body>
<c:forEach items="${creditscs}" var="sc">
    <a href="/creditsc/page/${sc.idCredit}">
        <div style="width:300px; height: 260px; background-color:bisque; color:fuchsia; float: left; margin: 10px;
        border: 3px double burlywood;">
            <p style="text-align: center;padding: 0 10px;font-size: 10pt;"> Назва Банку ${sc.bankName}</p>
            <p style="text-align: center;padding: 0 10px;font-size: 10pt;">${sc.type}</p>
            <p style="text-align: center;padding: 0 10px;font-size: 10pt;">${sc.sumCredit}</p>
            <p style="text-align: center;padding: 0 10px;font-size: 10pt;">${sc.percent}</p>
            <p style="text-align: center;padding: 0 10px;font-size: 10pt;">${sc.term}</p>
            <p style="text-align: center;padding: 0 10px;font-size: 10pt;">${sc.timeFee}</p>
            <p style="text-align: center;padding: 0 10px;font-size: 10pt;">${sc.monthFee}</p>
            <p style="text-align: center;padding: 0 10px;font-size: 10pt;">${sc.collateral}</p>
            <p style="text-align: center;padding: 0 10px;font-size: 10pt;"><a href="/creditsc/allsc/more">ДЕТАЛЬНІШЕ</a></p>


            <p style="text-align: center"><form:form cssStyle="text-align: center" action="/creditsc/edit/${sc.idCredit}"><button type="submit">EDIT</button></form:form></p>


            <p style="text-align: center"><form:form cssStyle="text-align: center" action="/creditsc/delete/${sc.idCredit}"><button type="submit">DELETE</button></form:form></p>

        </div>
    </a>
</c:forEach>

<p style="clear: left; text-align: center"><sec:authorize access="hasRole('ADMIN')"><a href="/creditsc/new">Add new Credit</a></sec:authorize></p>

</body>
</html>




