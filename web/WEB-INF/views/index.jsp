<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: yevge
  Date: 11.10.2016
  Time: 12:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Первая страница</title>
  </head>
  <body>
  <h1>Hello, ${user.name}!</h1>
  <spring:form modelAttribute="zadacha" action="tabulation" method="post">
    <spring:input type="text" path="start" />
    <spring:input path="finish" type="text" />
    <spring:input path="step" type="text" />
    <spring:button>Ok</spring:button>
  </spring:form>
  </body>
</html>
