<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

</head>
<form action="/pet" method="post">
    类型：<input type="number" name="caId">
    宠物名称：<input type="text" name="petName"/>
    价格：<input type="number" name="petPrice">
    状态：<input type="text" name="petStatus">
    <p></p>
    <input type="submit" value="添加">
</form>
<table>
    <tr>
        <th>编号</th>
        <th>类型编号</th>
        <th>类型</th>
        <th>宠物名称</th>
        <th>价格</th>
        <th>状态</th>
        <th>图片</th>
        <th>操作</th>
    </tr>
    <c:forEach items="${petList}" var="p">
        <tr>
            <th>${p.petId}</th>
            <th>${p.caId}</th>
            <th>${p.category.caName}</th>
            <th>${p.petName}</th>
            <th>${p.petPrice}</th>
            <th>${p.petStatus}</th>
            <th>无</th>
            <th><a href="/pet/delete?caId=${p.caId}">删除</a></th>
        </tr>

    </c:forEach>
</table>
</body>
</html>
