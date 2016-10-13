<%--
  Created by IntelliJ IDEA.
  User: Леся Гопшта
  Date: 03.08.2016
  Time: 9:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div style=" height: 90%;">
    <div style="font-size: 18px; text-align: center; width: 280px; height: 390px; background-color: #999999; color: white; float: inherit;position: absolute;left:38%; margin: 22px; border: 3px double black; border-radius: 0px;">
        <p style="color: black;"><strong>Name</strong></p>
        <p>${user.name}</p>
        <hr>
        <p><p style="color: black;"><strong>Surname</strong></p>
        <p>${user.surname}</p>
        <hr>
        <p><p style="color: black;"><strong>Email</strong></p>
        <p>${user.email}</p>
        <hr>
        <p><p style="color: black;"><strong>Mobile</strong></p>
        <p>${user.phone}</p>




        <a href="/income">Ввести доходи, грн: <button type="submit">Ввести:  </button> </a>


    </div>
</div>

</body>
</html>
