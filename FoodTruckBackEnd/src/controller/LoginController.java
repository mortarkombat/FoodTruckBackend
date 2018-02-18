package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginController extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		if(req.getMethod().equalsIgnoreCase("GET")) {
			System.out.println("µé¾î¿È");
			req.getRequestDispatcher("/view/Login.jsp").forward(req, resp);
			
		}
		else {
			
		}
	}
}
