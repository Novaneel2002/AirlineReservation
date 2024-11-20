package com.airline;

import java.io.*;

public class Flight {
    private int flightId;
    private String departure;
    private String destination;
    private int availableSeats;
    private String flightTime;
    private String flightClass;

    // Constructor
    public Flight(int flightId, String departure, String destination, int availableSeats, String flightTime, String flightClass) {
        this.flightId = flightId;
        this.departure = departure;
        this.destination = destination;
        this.availableSeats = availableSeats;
        this.flightTime = flightTime;
        this.flightClass = flightClass;
    }

    // Getters and Setters
    public int getFlightId() { return flightId; }
    public String getDeparture() { return departure; }
    public String getDestination() { return destination; }
    public int getAvailableSeats() { return availableSeats; }
    public String getFlightTime() { return flightTime; }
    public String getFlightClass() { return flightClass; }
}
