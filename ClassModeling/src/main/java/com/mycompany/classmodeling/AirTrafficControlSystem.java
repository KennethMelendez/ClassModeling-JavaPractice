/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.classmodeling;

/**
 *
 * @author Kenny
 */
public class AirTrafficControlSystem {
    public String airlineName;
    public int flightNumber;
    public int AirSpeed;
    public int cruisingAltitude;
    public String routeOfFlight;
    
    public AirTrafficControlSystem(){
        
    }

    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public int getAirSpeed() {
        return AirSpeed;
    }

    public void setAirSpeed(int AirSpeed) {
        this.AirSpeed = AirSpeed;
    }

    public int getCruisingAltitude() {
        return cruisingAltitude;
    }

    public void setCruisingAltitude(int cruisingAltitude) {
        this.cruisingAltitude = cruisingAltitude;
    }

    public String getRouteOfFlight() {
        return routeOfFlight;
    }

    public void setRouteOfFlight(String routeOfFlight) {
        this.routeOfFlight = routeOfFlight;
    }

}
