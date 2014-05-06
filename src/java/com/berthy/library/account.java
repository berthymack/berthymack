/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.berthy.library;

import java.io.Serializable;
import java.math.BigDecimal;

/**import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;**/

/**
 *
 * @author Berthy
 */

//@Entity
public class account implements Serializable
{
    
    private static final long serialVersionUID = 1L;
    /**@Id
    @GeneratedValue(strategy = GenerationType.AUTO)**/
    private Long id;
    private String name;
    private BigDecimal balance;

    private account(Builder builder) {
        id = builder.id;
        name = builder.name;
        balance = builder.balance;
        }

    public account() {
    }
    
    
    
    public static class Builder{
    private Long id;
    private String name;
    private BigDecimal balance;

        public Builder(String name) {
            this.name = name;
        }
    
        public Builder id(Long value){
            this.id = value;
            return this;
        }
        
        public Builder balance(BigDecimal value){
            this.balance = value;
            return this;
        }
        
        public account build(){
            return new account(this);
        }
    
        
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
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
        if (!(object instanceof account)) {
            return false;
        }
        account other = (account) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.berthy.library.account[ id=" + id + " ]";
    }
    
}
