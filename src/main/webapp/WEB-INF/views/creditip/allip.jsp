<%--
  Created by IntelliJ IDEA.
  User: Леся Гопшта
  Date: 09.10.2016
  Time: 20:38
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
<c:forEach items="${creditips}" var="ip">
    <a href="/creditip/page/${ip.idCredit}">
        <div style="width:300px; height: 260px; background-color:bisque; color:fuchsia; float: left; margin: 10px;
        border: 3px double burlywood;">
            <p style="text-align: center;padding: 0 10px;font-size: 10pt;"> Назва Банку ${ip.bankName}</p>
            <p style="text-align: center;padding: 0 10px;font-size: 10pt;">${ip.type}</p>
            <p style="text-align: center;padding: 0 10px;font-size: 10pt;">${ip.sumCredit}</p>
            <p style="text-align: center;padding: 0 10px;font-size: 10pt;">${ip.percent}</p>
            <p style="text-align: center;padding: 0 10px;font-size: 10pt;">${ip.term}</p>
            <p style="text-align: center;padding: 0 10px;font-size: 10pt;">${ip.timeFee}</p>
            <p style="text-align: center;padding: 0 10px;font-size: 10pt;">${ip.monthFee}</p>
            <p style="text-align: center;padding: 0 10px;font-size: 10pt;">${ip.collateral}</p>
            <p style="text-align: center;padding: 0 10px;font-size: 10pt;"><a href="/creditip/allip/more">ДЕТАЛЬНІШЕ</a></p>


            <p style="text-align: center"><form:form cssStyle="text-align: center" action="/creditip/edit/${ip.idCredit}"><button type="submit">EDIT</button></form:form></p>


            <p style="text-align: center"><form:form cssStyle="text-align: center" action="/creditip/delete/${ip.idCredit}"><button type="submit">DELETE</button></form:form></p>

        </div>
    </a>
</c:forEach>

<p style="clear: left; text-align: center"><sec:authorize access="hasRole('ADMIN')"><a href="/creditip/new">Add new Credit</a></sec:authorize></p>

</body>
</html>



