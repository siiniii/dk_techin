<%@ page language="java" contentType="text/plain; charset=UTF-8"%>
<%
response.setHeader("Access-Control-Allow-Origin", "*");
response.setHeader("Cache-Control", "no-cache");
%>
<% String news[] = { "한승현이 테스트를합니다. ㅋ",
							   "한승현이 테스트를합니다. ㅋㅋ",
							   "한승현이 테스트를합니다. ㅋㅋㅋ",
							   "한승현이 테스트를합니다. ㅋㅋㅋㅋ",
							   "한승현이 테스트를합니다. ㅋㅋㅋㅋㅋ",
					         }; %>
<% int num = (int)(Math.random() * 5); %>
{ 
	"news" : "<%= news[num] %>"
}