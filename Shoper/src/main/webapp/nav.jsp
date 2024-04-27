<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@include file="design.jsp" %>
<title>Insert title here</title>
</head>
<body>
	<div class="container">
	
		<nav class="navbar navbar-expand-lg bg-body-tertiary">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">ShowStoper</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNav">
      <ul class="navbar-nav">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="index.jsp">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="cart.jsp">Cart</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="order.jsp">Orders</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="login.jsp">login</a>
        </li>
        
      </ul>
      <nav class="navbar bg-body-tertiary ms-5">
  <div class="container-fluid">
    <form class="d-flex" role="search">
      <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
      <button class="btn btn-outline-success" type="submit">Search</button>
    </div>
  </div>
</nav>
	</div>
	<%@ include file="designfoot.jsp" %>
</body>
</html>