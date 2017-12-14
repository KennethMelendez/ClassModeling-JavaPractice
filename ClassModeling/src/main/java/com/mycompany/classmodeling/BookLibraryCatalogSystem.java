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
public class BookLibraryCatalogSystem {
    
    public String name;
    public String date;
    public String aurthor;
    public int ASIN;
    
    BookLibraryCatalogSystem(){
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAurthor() {
        return aurthor;
    }

    public void setAurthor(String aurthor) {
        this.aurthor = aurthor;
    }

    public int getASIN() {
        return ASIN;
    }

    public void setASIN(int ASIN) {
        this.ASIN = ASIN;
    }
    
    
    
}
