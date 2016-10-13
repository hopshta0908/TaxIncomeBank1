
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<div style="height: 120%; overflow: auto;">
    <div>

            <form:form action="/income" method="post">

                <p>Основний дохід, грн:</p>
                <p><input  name="mainIncome" type="text" placeholder="Основний дохід,грн"></p>

                <p>Дохід від додаткогового місця праці, грн:</p>
                <p><input  name="additionalIncome" type="text" placeholder="Додатковий дохід,грн"></p>

                <p>Дохід від авторських винагород, грн:</p>
                <p><input  name="royalty" type="text" placeholder="Роялті,грн"></p>

                <p>Дохід від продажу майна, грн:</p>
                <p><input  name="incomeOfSaleOfProperty" type="text" placeholder="Дохід від продажу майна,грн"></p>

                <p>Подарунки, грн:</p>
                <p><input  name="gift" type="text" placeholder="Подарунки,грн"></p>

                <p>Перекази із-за кордону,грн:</p>
                <p><input  name="transfersFromAbroad" type="text" placeholder="Перекази із-за кордону,грн"></p>

                <p>Пільги на дітей,грн:</p>
                <p><input  name="benefitsForChildren" type="text" placeholder="Пільги на дітей,грн"></p>

                <p>Матеріальна допомога, грн:</p>
                <p><input  name="financialAid" type="text" placeholder="Матеріальна допомога,грн"></p>

                <p><input id="submit" type="submit" value="Ввести"></p>
            </form:form>


    </div>
</div>

