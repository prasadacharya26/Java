package com.wolken.sodamachine;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SliceServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String coke = req.getParameter("slice");
		resp.setContentType("text/html");   
		if(!coke.isEmpty()) {
			RequestDispatcher rs = req.getRequestDispatcher("slice.html");
			rs.include(req,resp);
		}
	}	
}