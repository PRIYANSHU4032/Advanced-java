package com.java;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;




/**
 * Servlet implementation class Myserver
 */
@WebServlet("/Myserver")
public class Myserver extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Myserver() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//int n1 = Integer.parseInt(request.getParameter("num1"));
		//int n2 = Integer.parseInt(request.getParameter("num2"));
		//int k = n1+n2;
		//List<Student> stud = Arrays.asList(new Student(1,"shivam"),new Student(2,"priyanshu"),new Student(3,"simran"));	
		
		
	}

}
