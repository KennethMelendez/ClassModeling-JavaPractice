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
//class
public class House3DDesignSystem {
    //variables for house
    public int floors;
    public int bathrooms;
    public int rooms;
    
    //constructor
    public House3DDesignSystem(){
        
    }
    
    public void getFloors(int floors){
        this.floors = floors;
    }
    
    public int setFloors(){
        return floors;
    }
    
    public int getBathrooms(){
        return bathrooms;
    }
    
    public void setBathrooms(int bathrooms){
        this.bathrooms = bathrooms;
    }
    
    public int getRooms(){
        return rooms;
    }
    
    public void setRooms(int rooms){
        this.rooms = rooms;
    }
    
}
