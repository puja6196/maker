package com.nucleus.loginlogout;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class LoginLogout
 */
@WebServlet("/LoginLogout")
public class LoginLogout extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doLogin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
        String username=request.getParameter("username");
        String password=request.getParameter("password");
	}
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
     doLogin(request,response);
    
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
