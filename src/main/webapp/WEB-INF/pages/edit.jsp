<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="java.util.*"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <meta charset="UTF-8">
    <title>修改页面</title>
</head>
<body>

<form method="post" action="${pageContext.request.contextPath}/users/insert">
    <table border="1">

        <tr>
            <td colspan="2">修改用户信息</td>
        </tr>
        <tr>
            <td>编号</td>
            <td>
                <input type="text" name="id" value="${user.id}" readonly/>
            </td>
        </tr>
        <tr>
            <td>姓名</td>
            <td>
                <input type="text" name="username" value="${user.username }" />
            </td>
        </tr>
        <tr>
            <td>密码</td>
            <td>
                <input type="text" name="password" value="${user.password }"/>
            </td>
        </tr>
        <tr>
            <td>
                <a href="${pageContext.request.contextPath}/users/findUsers">返回</a>
            </td>
            <td>
                <input type="submit" value="提交" />
            </td>
        </tr>


    </table>

</form>

</body>
</html>