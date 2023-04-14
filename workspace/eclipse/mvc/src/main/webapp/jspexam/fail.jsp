<%@page import="model.domain.TimeVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
    TimeVO timeVO = (TimeVO) request.getAttribute("timeVO"); 
    int hour = timeVO.getHour(); 
    int minute = timeVO.getMinute(); 
%>
<h2><%= hour %>시 <%= minute %>분에 당첨 실패!! 아쉽아쉽</h2>
<img width="300px" alt="" src="images/sad.jpg"><br>
<a href="${ header.referer }">로또 응모 링크</a>
</body>
</html>






