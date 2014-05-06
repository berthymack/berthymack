/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.berthy.library;

import java.io.Serializable;

/**
 *
 * @author admin
 */
public class room implements Serializable
{
    private static final long serialVersionUID = 1L;
    //@Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    
    public static int NumRooms = 0;
    public Long id;
    private char type;
    private String status;
    private String time;
    
     public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }
	  public char GetType(){
	      return type;
	  }
          public void setType(char type){
	      this.type = type;
	  }
	   
	  
	  public String GetStatus(){
	      return status;
	  }
          public void setStatus(String status){
	      this.status = status;
	  }
          
	   
	  public String GetTime(){
	      return time;
	  }
          public void setTime(String time){
	      this.time = time;
	  }
          
          public int GetNumRooms(){
	      return NumRooms;
	  }
          public void setNumRooms(int NumRooms){
	        NumRooms--;
	   }
          
          @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof room)) {
            return false;
        }
        room other = (room) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.berthy.library.room[ id=" + id + " ]";
    }
          
}
