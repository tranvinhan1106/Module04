<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>List Medical</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js">
    <style>
        a{
            text-decoration: none;
        }
    </style>
</head>
<body>
<button><a href="/medical/createMedical">ADD new form medical</a>
</button>
<table border="1" class="table">
    <h2 style="text-align: center"> List Khai Báo Y Tế</h2>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Năm Sinh</th>
        <th>Giới tính</th>
        <th>Quốc tịch</th>
        <th>Chứng minh nhân dân hoặc hộ chiếu</th>
        <th>Thông tin đi lại</th>
        <th>Số hiệu phương tiện</th>
        <th>Số ghế</th>
        <th>Ngày Khởi Hành</th>
        <th>Ngày Kết thúc</th>
        <th>Đến tỉnh/tp khác</th>
        <th>Địa chỉ liên lạc</th>
        <th>Địa chỉ nơi ở</th>
        <th>Điện thoại</th>
        <th>Email</th>

        <th>Lịch sử phơi nhiễm</th>
        <th>Cập nhật</th>
    </tr>
    <c:forEach items="${list}" var="list">
        <tr>
            <td>${list.id}</td>
            <td>${list.name}</td>
            <td>${list.birth}</td>
            <td>${list.gender}</td>
            <td>${list.nationality}</td>
            <td>${list.passport}</td>
            <td>${list.travelInformation}</td>
            <td>${list.vehicleNumber}</td>
            <td>${list.seats}</td>
            <td>${list.departureDay}</td>
            <td>${list.endDay}</td>
            <td>${list.city}</td>
            <td>${list.moreInfo}</td>
            <td>${list.address}</td>
            <td>${list.numberPhone}</td>
            <td>${list.email}</td>
            <td>${list.exposureHistory}</td>
            <td>
                <a href="updateMedical?id=${list.id}">Cập nhật</a>
            </td>
        </tr>
    </c:forEach>
</table>

</body>
</html>