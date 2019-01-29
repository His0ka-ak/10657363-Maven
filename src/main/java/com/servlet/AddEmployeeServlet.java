package com.servlet;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.Employee;

public class AddEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		String empno = request.getParameter("empno");
		String empname = request.getParameter("empname");
		String empsal = request.getParameter("empsal");
		
		EmployeeDao empdao = new EmployeeDao();
		Employee e = new Employee(empno,empname,empsal);
	    empdao.insert(e);
		
		HttpSession session = request.getSession();
		session.setAttribute("message", "Record added successfully!");
		
		response.sendRedirect("addEmployee.jsp");
		
	}

}
