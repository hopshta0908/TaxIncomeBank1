<%--
  Created by IntelliJ IDEA.
  User: Леся Гопшта
  Date: 11.10.2016
  Time: 20:04
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div id="templatemo_main">
    <form:form id="searchbox" action="/searchh" method="post">
        <p><input id="search" name="bankName" type="text" placeholder="..."></p>
        <p><input id="submit" type="submit" value="Find"></p>
    </form:form>
    <p style="clear: left; text-align: center"><sec:authorize access="hasRole('ADMIN')"><a href="/creditavto/new">Додати пропозицію</a></sec:authorize></p>
    <div style="height: 100%">
        <div>
            <c:forEach items="${hhh}" var="a">

                <div class="col one_third gallery_box">
                    <div class="img_frame img_frame_13 img_nom"><span></span>
                        <a href="data:image/jpeg;base64,${a.image}" rel="lightbox[portfolio]"> <img
                                src="data:image/jpeg;base64,${a.image}" alt="Image 03"></a>
                    </div>
                    <h4><p>Найменування Банку ${a.bankName}</p></h4>
                    <h4><p>Програма кредитування ${a.type}</p></h4>
                    <h4><p>Максимальна сума кредиту,грн   ${a.sumCredit}</p></h4>
                    <h4><p>Відсоткова ставка,%   ${a.percent}</p></h4>
                    <h4><p>Термін кредитування,міс  ${a.term}</p></h4>
                    <h4><p>Одноразова комісія,%  ${a.timeFee}</p></h4>
                    <h4><p>Щомісячна комісія,%  ${a.monthFee}</p></h4>
                    <h4><p>Одноразова комісія,%  ${a.timeFee}</p></h4>
                    <h4><p> Вид забезпечення  ${a.collateral}</p></h4>


                    <sec:authorize access="hasRole('ADMIN')">
                        <a href="/edit/${a.idCredit}">
                            <button type="submit">Модифікувати</button>
                        </a>
                    </sec:authorize>
                    <p>
                        <sec:authorize access="hasRole('ADMIN')">
                            <form:form action="/creditavto/delete/${a.idCredit}" method="post">
                                <button type="submit">Видалити</button>
                            </form:form>
                        </sec:authorize>
                    </p>

                </div>

            </c:forEach>
        </div>
    </div>
    <div class="clear"></div>
</div>

