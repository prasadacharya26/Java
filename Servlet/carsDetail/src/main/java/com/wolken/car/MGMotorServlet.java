package com.wolken.car;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MGMotorServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.println("<html>"
				+ "<head>"
				+ "<title>MG Motor cars</title>"
				+ "</head>"
				+ "<body>"
				+ "MG cars price starts at Rs. 9.78 Lakh for Astor and goes upto Rs. 37.68 Lakh for "
				+ "Gloster. In total MG sells 5 new car models powered by Petrol Engines , "
				+ "Diesel Engines and Electric Engines along with automatic transmission options."
				+ " MG Astor is among the popular SUV cars in India . Apart from this MG is planning"
				+ " to launch 3 upcoming cars in India which includes 3, RC-6 and GS. Select a MG car"
				+ " to know the latest price, offers at dealer showroom in your city, specifications,"
				+ " pictures, mileage, user reviews from car owners and unbiased reviews by our auto "
				+ "experts."
				+ "</body>"
				+ "</html>");
		writer.close();
	}
}
