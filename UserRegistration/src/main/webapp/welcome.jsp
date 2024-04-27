<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="jakarta.servlet.http.HttpSession" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Welcome Page</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f4f4f4;
        }
        .container {
            max-width: 800px;
            margin: 100px auto;
            text-align: center;
        }
        h1 {
            color: #333;
        }
        p {
            color: #666;
        }
        .btn {
            display: inline-block;
            padding: 10px 20px;
            background-color: #007bff;
            color: #fff;
            text-decoration: none;
            border-radius: 5px;
            transition: background-color 0.3s ease;
            margin-right: 10px;
        }
        .btn:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
	<%
		HttpSession session1 = request.getSession();
	
	if(session1 !=null && session1.getAttribute("username") != null){
		String username = (String) session1.getAttribute("username");
				%>
    <div class="container">
        <h1>Welcome to Our Website,<%=username %> !</h1>
        <p>We're glad to have you here!</p>
        <p><a href="logout.jsp">logout</a></p>
        
    </div>
    <%
    }else{
    	response.sendRedirect("login.jsp");
    }
    		%>
</body>
</html>
    