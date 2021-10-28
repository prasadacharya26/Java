package com.wolken.car;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TataServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.println("<html>"
				+ "<head>"
				+ "<title>Tata cars</title>"
				+ "</head>"
				+ "<body>"
				+ "Tata cars price starts at Rs. 4.99 Lakh for Tiago and goes upto Rs. 23.17 Lakh for "
				+ "Safari. In total Tata sells 11 new car models powered by Petrol Engines , "
				+ "Diesel Engines and Electric Engines along with automatic transmission options. "
				+ "Tata Punch is among the popular SUV cars in India , Tata Altroz is among the top "
				+ "Hatchback cars in India and Tata Tigor is among the top Sedan cars in Indian auto "
				+ "market . Apart from this Tata is planning to launch 3 upcoming cars in India which "
				+ "includes Hexa, Sierra and EVision Electric. Select a Tata car to know the latest price,"
				+ " offers at dealer showroom in your city, specifications, pictures, mileage,"
				+ " user reviews from car owners and unbiased reviews by our auto experts."
				+ "</body>"
				+ "</html>");
		writer.close();
	}
}
