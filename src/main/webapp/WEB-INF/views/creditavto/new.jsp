<%--
  Created by IntelliJ IDEA.
  User: Леся Гопшта
  Date: 07.10.2016
  Time: 19:38
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add new credit</title>
</head>
<body>

</body>
</html>--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


        <form action="/creditavto/new?${_csrf.parameterName}=${_csrf.token}" method="post" enctype="multipart/form-data">
            <p>Найменування Банку</p>
            <a><input type="text" name="bankName"></a>

            <p>Програма кредитування</p>
            <a><input type="text" name="type"></a>

            <p>Максимальна сума кредиту, грн</p>
            <a><input type="number" name="sumCredit"></a>

            <p>Відсоткова ставка,%</p>
            <a><input type="text" name="percent"></a>

            <p>Термін кредитування, міс</p>
            <a><input type="number" name="term"></a>

            <p>Щомісячна комісія,%</p>
            <a><input type="text" name="monthFee"></a>

            <p>Одноразова комісія,%</p>
            <a><input type="text" name="timeFee"></a>

            <p>Вид забезпечення кредиту</p>
            <a><input type="text" name="collateral"></a>

            <p>Фото</p>
            <a><input type="file" name="image"></a>

            <p></p>
            <button type="submit">Додати!</button>
        </form>

