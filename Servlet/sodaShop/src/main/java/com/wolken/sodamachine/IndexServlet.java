package com.wolken.sodamachine;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class IndexServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("home");
		resp.setContentType("text/html");   
		if(!name.isEmpty()) {
			RequestDispatcher rs = req.getRequestDispatcher("index.html");
			rs.include(req,resp);
		}
	}	
}
