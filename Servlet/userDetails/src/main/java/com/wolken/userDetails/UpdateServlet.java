package com.wolken.userDetails;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wolken.userDetails.dto.LoginDTO;
import com.wolken.userDetails.service.RegistrationService;
import com.wolken.userDetails.service.RegistrationServiceImpl;

public class UpdateServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RegistrationService service=new RegistrationServiceImpl();
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		String cnfpassword=req.getParameter("cnfpassword");
		LoginDTO loginDTO=new LoginDTO();
		loginDTO.setEmail(email);
		loginDTO.setPassword(password);
		if(cnfpassword.equals(password)) {
		String login=service.validateandUpdatePassword(loginDTO);
		resp.setContentType("text/html");
		PrintWriter writer=resp.getWriter();
		writer.println("<html>"
				+ "<body>"
				+ "Result:"+login
				+ "</body>"
				+ "</html>");
		
		}
	}
}