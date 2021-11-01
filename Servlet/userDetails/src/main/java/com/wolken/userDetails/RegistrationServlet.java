package com.wolken.userDetails;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wolken.userDetails.dto.RegistrationDTO;
import com.wolken.userDetails.service.RegistrationService;
import com.wolken.userDetails.service.RegistrationServiceImpl;

public class RegistrationServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RegistrationService service=new RegistrationServiceImpl();
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String contact=req.getParameter("phone");
		String dob=req.getParameter("dob");
		String gender=req.getParameter("gender");
		String status=req.getParameter("status");
		String city=req.getParameter("city");
		String nation=req.getParameter("country");
		String password=req.getParameter("password");
		String cnfpassword=req.getParameter("cnfpassword");
	
		//RequestDispatcher dispatcher = req.getRequestDispatcher("ind");
		//dispatcher.forward(req, resp);
		RegistrationDTO dto = new RegistrationDTO();
		dto.setName(name);
		dto.setEmail(email);
		dto.setContactNumber(contact);
		dto.setDob(dob);
		dto.setGender(gender);
		dto.setStatus(status);
		dto.setCity(city);
		dto.setNationality(nation);
		dto.setPassword(password);
		resp.setContentType("text/html");
		PrintWriter writer=resp.getWriter();
		String isSaved=null;
		if(password.equals(cnfpassword)) {
			 isSaved=service.validateandsave(dto);
			
			writer.println("<html>"
					+ "<body>"
					+ "Result:"+isSaved
					+ "</body>"
					+ "</html>");
			
		}else {
			writer.println("<html>"
					+ "<body>"
					+ "Result:"+isSaved
					+ "</body>"
					+ "</html>");
		}
	}
}
