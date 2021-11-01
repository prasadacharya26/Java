package com.wolken.sodamachine;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ThumsupServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("thums-up");
		resp.setContentType("text/html");   
		if(!name.isEmpty()) {
			RequestDispatcher dispatcher = req.getRequestDispatcher("thumsup.html");
			dispatcher.include(req,resp);
		}
	}	
}