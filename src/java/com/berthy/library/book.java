/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.berthy.library;

import java.io.Serializable;
/**import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id**/

/**
 *
 * @author Berthy
 */

//@Entity
public class book implements Serializable
{
    private static final long serialVersionUID = 1L;
    //@Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    
    public static int NumBooks = 0;
    public Long id;
    private char type;
    private String status;
    private String author;
    private String publisher;
    private String dateBorrowed;
    private String title;
	     
	     
	     
	     
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
          
	   
	  public String GetAuthor(){
	      return author;
	  }
          public void setAuthor(String author){
	      this.author = author;
	  }
	   
	  public String GetPublisher(){
	      return publisher;
	  }
          public void setPublisher(String publisher){
	      this.publisher = publisher;
	  }
	   
	  public String GetdateBorrowed(){
	      return dateBorrowed;
	  }
          public void setdateBorrowed(String dateBorrowed){
	      this.dateBorrowed = dateBorrowed;
	  }
	   
	  public String GetTitle(){
	      return title;
	  }
          public void setTitle(String title){
	      this.title = title;
	  }
	   
	  public int GetNumBooks(){
	      return NumBooks;
	  }
          public void setNumBooks(int NumBooks){
	        NumBooks--;
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
        if (!(object instanceof book)) {
            return false;
        }
        book other = (book) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.berthy.library.book[ id=" + id + " ]";
    }
    
}
