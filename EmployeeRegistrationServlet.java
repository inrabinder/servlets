package com.yash.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmployeeRegistrationServlet
 */
@WebServlet("/ers")
public class EmployeeRegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String empName = request.getParameter("name");
		String empContact = request.getParameter("contact");
		String empSalary = request.getParameter("salary");
		String empEmail = request.getParameter("email");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title> EmployeeServletOutput </title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1> Thanks for registeration</h1><br>");
		out.println("<h2> Name:" + empName + "</h1><br>");
		out.println("<h2> Contact:" + empContact + "</h1><br>");
		out.println("<h2> Salary:" + empSalary + "</h1><br>");
		out.println("<h2> Email:" + empEmail + "</h1><br>");
		out.println("</body>");
		out.println("</html>");
	}

}
