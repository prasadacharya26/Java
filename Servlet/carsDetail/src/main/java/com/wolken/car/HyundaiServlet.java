package com.wolken.car;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HyundaiServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.println("<html>"
				+ "<head>"
				+ "<title>Hyundai cars</title>"
				+ "</head>"
				+ "<body>"
				+ "Hyundai cars price starts at Rs. 4.76 Lakh for Santro and goes upto "
				+ "Rs. 27.47 Lakh for Tucson. In total Hyundai sells 13 new car models powered "
				+ "by Petrol Engines , Diesel Engines , CNG Engines and Electric Engines along "
				+ "with automatic transmission options. Hyundai Creta is among the popular SUV "
				+ "cars in India , Hyundai i20 is among the top Hatchback cars in India and "
				+ "Hyundai Verna is among the top Sedan cars in Indian auto market . "
				+ "Apart from this Hyundai is planning to launch 3 upcoming cars in India which "
				+ "includes Nexo, Palisade and Sonata. Select a Hyundai car to know the latest price, "
				+ "offers at dealer showroom in your city, specifications, pictures, mileage, user "
				+ "reviews from car owners and unbiased reviews by our auto experts."
				+ "</body>"
				+ "</html>");
		writer.close();
	}
}
