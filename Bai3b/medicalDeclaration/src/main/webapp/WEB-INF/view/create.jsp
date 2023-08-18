<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>form medical</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js">
    <style>
        a {
            text-decoration: none;
        }
    </style>
</head>
<body>
<button><a href="list">Back to list</a></button>
<div class="container">
    <form:form action="save" method="post" modelAttribute="medical">
        <div>
            <table border="1" class="table">
                <tr>
                    <th>ID</th>
                </tr>
                <tr>
                    <td>
                        <c:choose>
                            <c:when test="${action == 'create'}">
                                <form:input path="id"/>
                            </c:when>
                            <c:otherwise>
                                <form:hidden path="id"/>
                            </c:otherwise>
                        </c:choose>
                    </td>
                </tr>

                <tr>
                    <th>Họ tên(ghi chữ IN HOA)</th>
                </tr>
                <tr>
                    <td><form:input path="name"/></td>
                </tr>

                <tr>
                    <th>Năm Sinh</th>
                </tr>
                <tr>
                    <td>
                        <form:select path="birth" items="${yearArrays}"/>
                    </td>
                </tr>
                <tr>
                    <th>Giới Tính</th>
                </tr>
                <tr>
                    <td><form:select path="gender" items="${genderArrays}"/></td>
                </tr>
                <tr>
                    <th>Quốc Tịch</th>
                </tr>
                <tr>
                    <td><form:select path="nationality" items="${nationalityArrays}"/></td>
                </tr>
                <tr>
                    <th>Số hộ chiếu hoặc số CMND hoặc giấy thông hành hợp pháp khác</th>
                </tr>
                <tr>
                    <td><form:input path="passport"/></td>
                </tr>
                <tr>
                    <th>Thông tin đi lại</th>
                </tr>
                <tr>
                    <td><form:radiobuttons path="travelInformation" items="${travelArrays}"/></td>
                </tr>
                <tr>
                    <th>Số hiệu Phương tiện</th>
                </tr>
                <tr>
                    <td><form:input path="vehicleNumber"/></td>
                </tr>
                <tr>
                    <th>Số Ghế</th>
                </tr>
                <tr>
                    <td><form:input path="seats"/></td>
                </tr>
                <tr>
                    <th>Ngày Khởi hành</th>
                </tr>
                <tr>
                    <td><form:input path="departureDay"/></td>
                </tr>
                <tr>
                    <th>Ngày Kết thúc</th>
                </tr>
                <tr>
                    <td><form:input path="endDay"/></td>
                </tr>
                <tr>
                    <th>Địa chỉ liên lạc</th>
                </tr>
                <tr>
                    <td><form:input path="city"/></td>
                </tr>
                <tr>
                    <th>Địa chỉ nơi ở</th>
                </tr>
                <tr>
                    <td><form:input path="address"/></td>
                </tr>
                <tr>
                    <th>Số điện thoại</th>
                </tr>
                <tr>
                    <td><form:input path="numberPhone"/></td>
                </tr>
                <tr>
                    <th>Email</th>
                </tr>
                <tr>
                    <td><form:input path="email"/></td>
                </tr>
            </table>
        </div>
        <div class="content2">
            <table border="1"   >
                <th>
                    <tr>Lịch sử phơi nhiễm</tr>
                </th>
                <th>
                    Tiếp xúc gần
                <td><form:checkbox path="exposureHistory" value="Tiếp xúc gần"/></td>
                </th>
                <th>
                     Đến trang trại / tiếp xúc động vật
                <td><form:checkbox path="exposureHistory" value="Đến trang trại / tiếp xúc động vật"/></td>
                </th>
            </table>
        </div>
        <br>
        <form:button>Gửi tờ khai</form:button>
        <input type="hidden" name="action" value="${action}">
    </form:form>
</div>
</body>
</html>