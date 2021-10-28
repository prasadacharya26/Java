package com.wolken.car;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MarutiSuzukiServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.println("<html>"
				+ "<head>"
				+ "<title>Maruti Suzuki cars</title>"
				+ "</head>"
				+ "<body>Maruti Suzuki cars price starts at Rs. 3.15 Lakh for Alto 800 and goes "
				+ "upto Rs. 12.56 Lakh for S-Cross. In total Maruti Suzuki sells 16 new car models "
				+ "powered by Petrol Engines and CNG Engines along with automatic transmission options. "
				+ "Maruti Suzuki Swift is among the top Hatchback cars in India , "
				+ "Maruti Suzuki Vitara Brezza is among the popular SUV cars in India and Maruti "
				+ "Suzuki Dzire is among the top Sedan cars in Indian auto market . "
				+ "Apart from this Maruti Suzuki is planning to launch 3 upcoming cars in "
				+ "India which includes YRA, Alto 2022 and Solio. Select a Maruti Suzuki car "
				+ "to know the latest price, offers at dealer showroom in your city, specifications, "
				+ "pictures, mileage, user reviews from car owners and unbiased reviews by our auto "
				+ "experts."
				+ "</body>"
				+ "</html>");
		writer.close();
	}
}