<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: yueyue
  Date: 2023/3/30
  Time: 10:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>indeex</title>
</head>

<body>
<form action="/value/getAll.do" method="post">
   <p>value:<input type="text" name="value"/></p>
   <p>text:<input type="text" name="text"/></p>
   <p>orderNo:<input type="text" name="orderNo"/></p>
   <p>typeName<input type="text" name="typeName"/></p>
   <hr>
    <button type="submit">查询</button>
</form>
<table width="50%" border="1">
    <tr>
        <td>id</td>
        <td>value</td>
        <td>text</td>
        <td>orderNo</td>
        <td>typeCode</td>
        <td>typeName</td>
    </tr>
    <C:forEach items="${values}" var="value" >


        <tr>
            <td>${value.id}</td>
            <td>${value.value}</td>
            <td>${value.text}</td>
            <td>${value.orderNo}</td>
            <td>${value.typeCode}</td>
            <td>${value.type.name}</td>
        </tr>
    </C:forEach>

</table>
</body>
</html>
