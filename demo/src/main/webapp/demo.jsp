<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<%
			String url = "jdbc:mysql://localhost:3306/mysql";
        	String username = "root";
        	String password = "8539909495";

        // Attempt to establish a connection
        try  {
        	
        	Connection connection = DriverManager.getConnection(url, username, password);
        	out.println("Connected to database");        	
        } catch (SQLException e) {
            out.println("Error connecting to the database: " + e.getMessage());
        }
        %>
</body>
</html>