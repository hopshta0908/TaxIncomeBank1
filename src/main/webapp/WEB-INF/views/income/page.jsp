<%--
  Created by IntelliJ IDEA.
  User: Леся Гопшта
  Date: 02.08.2016
  Time: 23:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<div>
    <p>id user ${income.getIdIncome()}</p>
    <p>Main income${income.getMainIncome()}</p>
    <p>Additional income${income.getMainIncome()}</p>
    <p>Royalty${income.getMainIncome()}</p>
    <p>Income of sale of property${income.getMainIncome()}</p>
    <p>income from gifts${income.getMainIncome()}</p>
    <p>Transfers from abroad${income.getMainIncome()}</p>
    <p>Benefits for children${income.getMainIncome()}</p>
    <p>Financial aid${income.getMainIncome()}</p>

    <a href="/tax/${income.getIdIncome()}">Go to created income</a>

</div>