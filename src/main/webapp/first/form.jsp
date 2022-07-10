<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Form</title>
</head>
<body>

<form action="/first/form" method="post">
    paramName
    <input type="text" name="paramName"/>
    paramDate
    <%--    <input type = "text" name = "paramDate"/>--%>
    <input type="date" name="paramDate">
    <input type="submit" value=" Wyślij"/>
</form>

</body>
</html>
