<%--
  Created by IntelliJ IDEA.
  User: Леся Гопшта
  Date: 28.09.2016
  Time: 19:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<div style="height: 120%;overflow: auto;">
    <div>
        %{income}
        <p>Податок з заробітньої плати ${taxMainIncome} грн</p>
        <p>Податок з додаткового місця праці ${taxAdditionalIncome} грн</p>
        <p>Податок з авторських виплат ${taxRoyalty} грн</p>
        <p>Податок з продажу майна ${taxIncomeOfSaleOfProperty} грн</p>
        <p>Податок з отриманих подарунків ${taxGift} грн</p>
        <p>Податок з переказів із-за кордону ${taxTransfersFromAbroad} грн</p>
        <p>Податок на матеріальну допомогу ${taxFinancialAid} грн</p>



    </div>
</div>
