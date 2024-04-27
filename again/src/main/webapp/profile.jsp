<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Table Creation</title>
</head>
<body>
    <%
        // Correct the driver class name
        Class.forName("org.postgresql.Driver");

        String url = "jdbc:postgresql://localhost:5432/Avengers";
        String username = "postgres";
        String password = "8539909495";

        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement smt = connection.createStatement();

            // Corrected the query string
            String query = "CREATE TABLE IF NOT EXISTS users (user_id SERIAL PRIMARY KEY, username VARCHAR(50) NOT NULL, email VARCHAR(100) NOT NULL UNIQUE, created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP);";

            smt.execute(query);
            out.println("Table created successfully");
            connection.close();
        } catch (Exception e) {
            out.println("Error creating table: " + e.getMessage());
        }
    %>
</body>
</html>
