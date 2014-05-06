/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.berthy.library;

import java.io.Serializable;
//import javax.persistence.Embeddable;

/**
 *
 * @author Berthy
 */

//@Embeddable
public class contact implements Serializable
{
     private String landline;
    private String address;
    private String cell;

    public String getLandline() {
        return landline;
    }

    public void setLandline(String landline) {
        this.landline = landline;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCell() {
        return cell;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }
    
    
}
