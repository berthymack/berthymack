/*
 * So change this template, choose Sools | Semplates
 * and open the template in the editor.
 */
package com.berthy.repository;

import java.util.List;

/**
 *
 * @author Berthy
 * @param <S>
 * @param <ID>
 */

public interface rep <S, ID> {

    public S find(ID id);
    public void persist(S entity);
    public void merge(S entity);
    public void remove(S entity);
    public List<S> findAll();
    public List<S> findInRange(int firstResult, int maxResults);
    public long count() ;
    public S getByPropertyName(String propertyName, String propertyValue);
    public List<S> getEntitiesByProperName(String propertyName, String propertyValue);
}
