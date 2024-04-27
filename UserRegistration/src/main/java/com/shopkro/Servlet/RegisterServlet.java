package com.shopkro.Servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

import org.apache.catalina.User;
import com.shopkro.Dao.UserDao;
import com.shopkro.Dao.UserDaoImp;
import com.shopkro.Dao.Usersdata;


public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static UserDao userDao = new UserDaoImp();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		
		Usersdata  userdata = new Usersdata();
		userdata.setUsername(username);
		userdata.setEmail(email);
		userdata.setPassword(password);
		
		
		if(userDao.addUser(userdata)) {
			response.sendRedirect("login.jsp?registration=success");
		}else {
			
			response.sendRedirect("register.jsp?error=1");
			

		}
    }	

}
