package com.wolken.car;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BMWServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.println("<html>"
				+ "<head>"
				+ "<title>BMW cars</title>"
				+ "</head>"
				+ "<body>BMW cars price in India starts at Rs. 39.50 Lakh for X1 and goes upto "
				+ "Rs. 2.46 Crore for 7 Series. In total BMW sells 18 new car models powered by "
				+ "Petrol Engines and Diesel Engines along with automatic transmission options. "
				+ "BMW X1 is among the popular SUV cars in India , BMW 3 Series is among the top "
				+ "Sedan cars in India and BMW X6 is among the top Luxury cars in Indian auto market . "
				+ "Apart from this BMW is planning to launch 3 upcoming cars in India which includes "
				+ "M3, M4 and X2. Select a BMW car to know the latest price, offers at dealer showroom "
				+ "in your city, specifications, pictures, mileage, user reviews from car owners and "
				+ "unbiased reviews by our auto experts."
				+ "</body>"
				+ "</html>");
		writer.close();
	}
}
