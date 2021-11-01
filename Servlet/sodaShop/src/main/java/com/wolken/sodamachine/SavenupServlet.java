package com.wolken.sodamachine;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SavenupServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String coke = req.getParameter("saven-up");
		resp.setContentType("text/html");   
		if(!coke.isEmpty()) {
			RequestDispatcher rs = req.getRequestDispatcher("savenup.html");
			rs.include(req,resp);
		}
	}	
}
