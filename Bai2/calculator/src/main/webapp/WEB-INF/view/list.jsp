<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h4>Calculator</h4>
<form method="post" action="/calculator">
    <input type="text" name="a"> <br> <br>
    <input type="text" name="b"> <br> <br>
    <input type="submit" value="+" name="submit">
    <input type="submit" value="-" name="submit">
    <input type="submit" value="*" name="submit">
    <input type="submit" value="/" name="submit">
</form>
</body>
</html>