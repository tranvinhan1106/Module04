<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>CurrencyConversion</title>
</head>
<body>
<form method="post" action="/calculate">
        <table>
            <h4>CurrencyConversion</h4>
            <tr>
                <td>Enter money :</td>
                <td><input type="number" name="usd"></td>
            </tr>
            <tr>
                <td>Rate:</td>
                <td><input type="number" name="rate"></td>
            </tr>
            <tr>
                <td><input type="submit" value="Converter"></td>
            </tr>
        </table>
</form>
</body>
</html>
