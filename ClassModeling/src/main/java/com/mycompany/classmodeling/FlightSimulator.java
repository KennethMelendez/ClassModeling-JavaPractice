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
public class FlightSimulator {
    public boolean Preflight;
    public boolean TakeOff;
    public boolean Departure;
    public boolean EnRoute;
    public boolean Descent;
    public boolean Approach;
    public boolean Landing;
    
    FlightSimulator(){
        
    }

    public boolean isPreflight() {
        return Preflight;
    }

    public void setPreflight(boolean Preflight) {
        this.Preflight = Preflight;
    }

    public boolean isTakeOff() {
        return TakeOff;
    }

    public void setTakeOff(boolean TakeOff) {
        this.TakeOff = TakeOff;
    }

    public boolean isDeparture() {
        return Departure;
    }

    public void setDeparture(boolean Departure) {
        this.Departure = Departure;
    }

    public boolean isEnRoute() {
        return EnRoute;
    }

    public void setEnRoute(boolean EnRoute) {
        this.EnRoute = EnRoute;
    }

    public boolean isDescent() {
        return Descent;
    }

    public void setDescent(boolean Descent) {
        this.Descent = Descent;
    }

    public boolean isApproach() {
        return Approach;
    }

    public void setApproach(boolean Approach) {
        this.Approach = Approach;
    }

    public boolean isLanding() {
        return Landing;
    }

    public void setLanding(boolean Landing) {
        this.Landing = Landing;
    }
    
}
