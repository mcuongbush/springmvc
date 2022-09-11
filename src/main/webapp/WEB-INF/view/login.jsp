<%--
  Created by IntelliJ IDEA.
  User: cuong
  Date: 04/09/2022
  Time: 8:42 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login page</title>

</head>
<body>
<form:form action="/Controllers_war/info" modelAttribute="employee">
    First name: <form:input path="username" />
    <br><br>
    Last name: <form:input path="pass" />
    <br><br>
    <input type="submit" value="Submit" />
</form:form>
</body>
</html>
