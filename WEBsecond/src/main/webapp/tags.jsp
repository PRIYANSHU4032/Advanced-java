<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<%@ page import="java.util.*" %>
		<%! int k =0; %>
		<%
			int i = 3;
			int j = 4;
			k = i+j;
				%>
				
				My result is <%= k %>
</body>
</html>