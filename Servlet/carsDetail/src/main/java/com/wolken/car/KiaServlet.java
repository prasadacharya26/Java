package com.wolken.car;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class KiaServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.println("<html>"
				+ "<head>"
				+ "<title>Kia cars</title>"
				+ "</head>"
				+ "<body>"
				+ "Kia cars price starts at Rs. 6.89 Lakh for Sonet and goes upto Rs. 33.99 Lakh for "
				+ "Carnival. In total Kia sells 3 new car models powered by Petrol Engines and Diesel"
				+ " Engines along with automatic transmission options. Kia Seltos is among the popular"
				+ " SUV cars in India . Apart from this Kia is planning to launch 3 upcoming cars in "
				+ "India which includes Sportage, Ceed and Sorento. Select a Kia car to know the latest"
				+ " price, offers at dealer showroom in your city, specifications, pictures, mileage, "
				+ "user reviews from car owners and unbiased reviews by our auto experts."
				+ "</body>"
				+ "</html>");
		writer.close();
	}
}
