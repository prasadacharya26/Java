package com.wolken.car;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SkodaServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.println("<html>"
				+ "<head>"
				+ "<title>Skoda cars</title>"
				+ "</head>"
				+ "<body>"
				+ "Skoda cars price starts at Rs. 7.79 Lakh for Rapid and goes upto Rs. 35.85 Lakh "
				+ "for Superb. In total Skoda sells 4 new car models powered by Petrol Engines only along"
				+ " with automatic transmission options. Skoda Kushaq is among the popular SUV cars in"
				+ " India and Skoda Rapid is among the top Sedan cars in Indian auto market ."
				+ " Apart from this Skoda is planning to launch 3 upcoming cars in India which "
				+ "includes Slavia, Scala and Kamiq. Select a Skoda car to know the latest price,"
				+ " offers at dealer showroom in your city, specifications, pictures, mileage, "
				+ "user reviews from car owners and unbiased reviews by our auto experts."
				+ "</body>"
				+ "</html>");
		writer.close();
	}
}
