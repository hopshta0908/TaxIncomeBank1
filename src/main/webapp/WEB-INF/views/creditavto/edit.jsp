<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div style="height: 100%">

        <form action="/edit?${_csrf.parameterName}=${_csrf.token}" method="post" enctype="multipart/form-data">

            <table cellpadding="5px">

                <tr>
                    <td align="right">
                        Id:
                    </td>
                    <td align="left">
                <input type="number" name="idCredit" value="${editC.idCredit}">
                    </td>
                </tr>

                <tr>
                    <td align="right">
                        Найменування Банку:
                    </td>
                    <td align="left">
                <input type="text" name="bankName" value="${editC.bankName }">
                    </td>
                </tr>


                <tr>
                    <td align="right">
                        Програма кредитування:
                    </td>
                    <td align="left">
                        <input type="text" name="type" value="${editC.type }">
                    </td>
                </tr>

                <tr>
                    <td align="right">
                        Максимальна сума кредиту, грн:
                    </td>
                    <td align="left">
                <input type="number" name="sumCredit" value="${editC.sumCredit}">
                    </td>
                </tr>

                <tr>
                    <td align="right">
                        Відсоткова ставка,%:
                    </td>
                    <td align="left">
                <input type="text" name="percent" value="${editC.percent}">
                    </td>
                </tr>

                <tr>
                    <td align="right">

                        Термін кредитування, міс:
                    </td>
                    <td align="left">
                <input type="number" name="term" value="${editC.term}">
                    </td>
                </tr>

                <tr>
                    <td align="right">
                        Щомісячна комісія,%:
                    </td>
                    <td align="left">
                <input type="text" name="monthFee" value="${editC.monthFee}">
                    </td>
                </tr>

                <tr>
                    <td align="right">
                        Одноразова комісія,%:
                    </td>
                    <td align="left">
                <input type="text" name="timeFee" value="${editC.timeFee}">
                    </td>
                </tr>

                <tr>
                    <td align="right">
                        Тип застави:
                    </td>
                    <td align="left">
                <input type="text" name="collateral" value="${editC.collateral }">
                    </td>
                </tr>

                <tr>
                    <td align="right">
                        Зображення:
                    </td>
                    <td align="left">
                <input type="file" name="image">
                    </td>
                </tr>
                <button type="submit">Редагувати</button>

            </table>


        </form>
    </div>
</div>