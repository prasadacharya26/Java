package com.wolken.car;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LandRoverServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.println("<html>"
				+ "<head>"
				+ "<title>Land Rover cars</title>"
				+ "</head>"
				+ "<body>"
				+ "Land Rover cars price in India starts at Rs. 64.12 Lakh for Range Rover Evoque and "
				+ "goes upto Rs. 4.38 Crore for Range Rover. In total Land Rover sells 7 new car models"
				+ " powered by Petrol Engines and Diesel Engines along with automatic transmission options."
				+ " Land Rover Range Rover is among the popular SUV cars in India . Apart from this "
				+ "Land Rover is planning to launch 2 upcoming cars in India which includes DC100, "
				+ "Range Rover 2022 and. Select a Land Rover car to know the latest price, offers at "
				+ "dealer showroom in your city, specifications, pictures, mileage, user reviews from "
				+ "car owners and unbiased reviews by our auto experts."
				+ "</body>"
				+ "</html>");
		writer.close();
	}
}
