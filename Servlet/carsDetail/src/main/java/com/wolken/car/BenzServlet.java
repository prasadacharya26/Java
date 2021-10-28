package com.wolken.car;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BenzServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.println("<html>"
				+ "<head>"
				+ "<title>Mercedes-Benz cars</title>"
				+ "</head>"
				+ "<body>Mercedes-Benz cars price in India starts at Rs. 41.20 Lakh for "
				+ "A-Class Limousine and goes upto Rs. 2.63 Crore for AMG GT. In total Mercedes-Benz "
				+ "sells 26 new car models powered by Petrol Engines , Diesel Engines and Electric "
				+ "Engines along with automatic transmission options. Mercedes-Benz GLA is among the "
				+ "popular SUV cars in India , Mercedes-Benz S-Class is among the top Sedan cars in "
				+ "India and Mercedes-Benz CLS is among the top Luxury cars in Indian auto market . "
				+ "Apart from this Mercedes-Benz is planning to launch 3 upcoming cars in India which "
				+ "includes EQS, GLB and B-Class 2020. Select a Mercedes-Benz car to know the latest "
				+ "price, offers at dealer showroom in your city, specifications, pictures, mileage, "
				+ "user reviews from car owners and unbiased reviews by our auto experts."
				+ "</body>"
				+ "</html>");
		writer.close();
	}
}
