<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>epolsoft.com</title>
</head>
<body>
<h2>${name}</h2>

    <form method="post" action="result">
    <p>add two numbers</p>
    <input type="number" max="1073741823" required name="value1">
    <input type="number" max="1073741823" required name="value2">
    <input type="submit" value="Calculate">
    </form>

</body>
</html>