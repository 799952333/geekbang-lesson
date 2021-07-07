<%--
  Created by IntelliJ IDEA.
  User: mzh
  Date: 2021/6/7
  Time: 19:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/mytag" prefix="bamboo"%>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <bamboo:setHeader acceptEncoding="gzip, deflate" cacheControl="no-cache" connection="keep-alive" host="localhost:8080"/>
  <bamboo:helloWorld testInfo="printTestInfo">print again</bamboo:helloWorld>
  <bamboo:printTestInfo>print bodyContext</bamboo:printTestInfo>
  <form action="test" method="post">
    <input type="submit" value="提交"/>
  </form>
  <form action="test" method="get">
    <input type="submit" value="提交"/>
  </form>
  </body>
</html>
