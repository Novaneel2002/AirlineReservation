<%@ page import="java.util.List" %>
<%@ page import="com.airline.Flight" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Flight Results</title>
</head>
<body>
    <h2>Flight Search Results</h2>

    <table border="1">
        <thead>
            <tr>
                <th>Flight ID</th>
                <th>Departure</th>
                <th>Destination</th>
                <th>Available Seats</th>
                <th>Flight Time</th>
                <th>Flight Class</th>
            </tr>
        </thead>
        <tbody>
            <% 
                List<Flight> flights = (List<Flight>) request.getAttribute("flights");
                if (flights != null && !flights.isEmpty()) {
                    for (Flight flight : flights) {
            %>
            <tr>
                <td><%= flight.getFlightId() %></td>
                <td><%= flight.getDeparture() %></td>
                <td><%= flight.getDestination() %></td>
                <td><%= flight.getAvailableSeats() %></td>
                <td><%= flight.getFlightTime() %></td>
                <td><%= flight.getFlightClass() %></td>
            </tr>
            <% 
                    }
                } else {
            %>
            <tr>
                <td colspan="6">No flights found for the selected route.</td>
            </tr>
            <% 
                }
            %>
        </tbody>
    </table>

    <a href="index.html">Go Back to Search</a>
</body>
</html>
