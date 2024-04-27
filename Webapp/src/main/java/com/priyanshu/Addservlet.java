package com.priyanshu;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/add")
public class Addservlet extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i+j;
		Cookie cookie = new Cookie("k",k+"");
		res.addCookie(cookie);
		//PrintWriter out = res.getWriter();
		//out.println("result is: "+k);
		
		//res.sendRedirect("sq?k="+k);//session management(2 method)
		//HttpSession session = req.getSession();
		//session.setAttribute("k", k);
		res.sendRedirect("sq");
		
		
		//req.setAttribute("k", k);	
		//RequestDispatcher rd = req.getRequestDispatcher("sq");(1 method)
		//rd.forward(req, res);
	}
	

}
