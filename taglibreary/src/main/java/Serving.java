

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import taglibreary.Students;

import java.io.IOException;


@WebServlet("/serve")
public class Serving extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Students s = new Students(1,"shivam");
		request.setAttribute("student", s);
		RequestDispatcher rd = request.getRequestDispatcher("output.jsp");
		rd.forward(request, response);
	
}
}
