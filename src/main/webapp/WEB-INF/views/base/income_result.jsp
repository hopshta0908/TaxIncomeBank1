
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<div style="height: 120%; overflow: auto;">
    <div>


<c:forEach items="${tttt}" var="a">

        <p>Податок з заробітньої плати, грн :${a.taxMainIncome}</p>
        <p>Податок з додаткового місця праці, грн :${a.taxAdditionalIncome} </p>
        <p>Податок з авторських виплат , грн :${a.taxRoyalty} </p>
        <p>Податок з продажу майна , грн:${a.taxIncomeOfSaleOfProperty} </p>
        <p>Податок з отриманих подарунків , грн:${a.taxGift} </p>
        <p>Податок з переказів із-за кордону , грн:${a.taxTransfersFromAbroad} </p>
        <p>Податок з пільг на дітей , грн:${a.taxBenefitsForChildren} </p>
        <p>Податок на матеріальну допомогу, грн: ${a.taxFinancialAid} </p>




</c:forEach>
        <p>Сума поодатків ${sum} грн.</p>
    </div>
</div>

