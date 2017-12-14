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
public class IceCreamControlSystem {
    public boolean crushedIce;
    public boolean churningProcessComplete;
    public boolean isUnitCold;
    public boolean twistCanister;
    
    IceCreamControlSystem(){
            
        }

    public boolean isCrushedIce() {
        return crushedIce;
    }

    public void setCrushedIce(boolean crushedIce) {
        this.crushedIce = crushedIce;
    }

    public boolean isChurningProcessComplete() {
        return churningProcessComplete;
    }

    public void setChurningProcessComplete(boolean churningProcessComplete) {
        this.churningProcessComplete = churningProcessComplete;
    }

    public boolean isIsUnitCold() {
        return isUnitCold;
    }

    public void setIsUnitCold(boolean isUnitCold) {
        this.isUnitCold = isUnitCold;
    }

    public boolean isTwistCanister() {
        return twistCanister;
    }

    public void setTwistCanister(boolean twistCanister) {
        this.twistCanister = twistCanister;
    }
    

    
}
