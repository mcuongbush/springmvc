
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<html>
<head>
    <title>login page</title>

</head>
<body>
<form:form action="/Controllers_war/info" modelAttribute="student">
    First name: <form:input path="username" />
    <br><br>
    Last name: <form:input path="pass" />
    <br><br>
    <input type="submit" value="Submit" />
</form:form>
</body>
</html>