<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Multiply</title>
</head>
<body>


<table>
    <c:forEach items="${numbers}" var="number">
        <tr>
<%--            <c:forEach items="${innerNumbers}" var="inner">--%>
<%--                <td>${number}</td>--%>
<%--            </c:forEach>--%>
    <c:forEach items="${innerNumbers}" var="inner">
        <td>${inner}</td>
    </c:forEach>
                <%--            <td>${number}</td>--%>
        </tr>
    </c:forEach>

</table>

</body>
</html>
