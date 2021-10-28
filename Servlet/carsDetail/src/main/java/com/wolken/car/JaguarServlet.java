package com.wolken.car;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class JaguarServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.println("<html>"
				+ "<head>"
				+ "<title>Jaguar cars</title>"
				+ "</head>"
				+ "<body>Jaguar cars price in India starts at Rs. 46.64 Lakh for XE and goes upto "
				+ "Rs. 2.61 Crore for F-TYPE. In total Jaguar sells 5 new car models powered by "
				+ "Petrol Engines , Electric Engines and Diesel Engines along with automatic "
				+ "transmission options. Jaguar F-TYPE is among the top Luxury cars in India , "
				+ "Jaguar XE is among the top Sedan cars in India and Jaguar I-Pace is among the "
				+ "popular SUV cars in India . Apart from this Jaguar is planning to launch 3 "
				+ "upcoming cars in India which includes E Pace, C X17 and C X75. Select a Jaguar "
				+ "car to know the latest price, offers at dealer showroom in your city, specifications, "
				+ "pictures, mileage, user reviews from car owners and unbiased reviews by our auto "
				+ "experts."
				+ "</body>"
				+ "</html>");
		writer.close();
	}
}
