<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<table align='center' border='1' cellspacing='0'>
    <tr>
        <td>id</td>
        <td>name</td>
    </tr>
    <c:forEach items="${users}" var="u" varStatus="us">
        <tr>
            <td>${u.id}</td>
            <td>${u.name}</td>
        </tr>
    </c:forEach>
</table>