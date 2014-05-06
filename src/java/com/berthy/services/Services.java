/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.berthy.services;

import java.util.List;

/**
 *
 * @author Berthy
 * @param <S>
 * @param <ID>
 */

public interface Services <S, ID> {

    public S find(ID id);

    public S create(S entity);
    
    public S read(S entity);

    public S update(S entity);

    public void delete(S entity);

    public List<S> findAll();
}
