<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Update MailBox</title>
    <style>
        #cancel {
            text-decoration: none;
        }
    </style>
</head>
<body>
<h1>Update MailBox</h1>
<form:form action="update" method="post" modelAttribute="mail">
    <table>
        <form:hidden path="id"/>
        <tr>
            Language :<form:select path="language" items="${language}"/>
        </tr>
        <br>
        <br>
        <tr>
            PageSize : Show <form:select path="pageSize" items="${pageSize}"/> email per page
        </tr>
        <br>
        <br>
        <tr>
            SpamsFilter : <form:checkbox path="spamsFilter" value="Cho phép"/> Enable spams filter
        </tr>
        <br>
        <br>
        <tr>
            Signature : <form:textarea path="signature"/>
        </tr>
        <br>
        <br>
        <tr>
            <td colspan="2">
                <input type="submit" value="update">
            </td>
            <td>
                <button><a href="/mail/list" id="cancel">Cancel</a></button>
            </td>
        </tr>
    </table>
    <p><input type="hidden" name="update"></p>

</form:form>

</body>
</html>
