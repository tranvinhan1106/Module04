<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>List</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js">
</head>
<body>
<h1 style="text-align: center">List MailBox</h1>
<table border="1" class="table">
    <tr>
        <th>id</th>
        <th>language</th>
        <th>pageSize</th>
        <th>spamsFilter</th>
        <th>signature</th>
        <th>edit</th>
    </tr>
    <c:forEach items="${Mail}" var="mail">
        <tr>
            <td>${mail.id}</td>
            <td>${mail.language}</td>
            <td>${mail.pageSize}</td>
            <td>${mail.spamsFilter}</td>
            <td>${mail.signature}</td>
            <td>
                <a href="/mail/update?id=${mail.id}">Edit</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</body>
</html>