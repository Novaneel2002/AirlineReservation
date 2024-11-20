package com.airline;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.util.List;

@WebServlet("/searchFlights")
public class SearchFlightServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	DatabaseUtil.testConnection();
        String departure = request.getParameter("departure");
        String destination = request.getParameter("destination");
        System.out.println(departure);
        System.out.println(destination);
        // Call the DatabaseUtil to search flights and get the list of flights
        List<Flight> flights = DatabaseUtil.searchFlights(departure, destination);
        for (Flight flight : flights) {
            System.out.println("Flight ID: " + flight.getFlightId());
        }
        // Set the List of flights as a request attribute for the JSP page
        request.setAttribute("flights", flights);

        // Forward the request to the results page (searchResults.jsp)
        RequestDispatcher dispatcher = request.getRequestDispatcher("/searchResults.jsp");
        dispatcher.forward(request, response);
    }
}
