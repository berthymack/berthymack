/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.berthy.repository.REPOS;

import com.berthy.library.library;
import com.berthy.repository.libraryRep;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
/**import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;**/

/**
 *
 * @author admin
 */

//@Repository("libraryRep")
//@Transactional //Put here for rep testing purposes
public class libraryREPOS implements libraryRep
{

    @PersistenceContext
    private EntityManager em;

    /**
     *
     * @param id
     * @return
     */
    @Override
    public library find(Long id) {
        return em.find(library.class, id);
    }

    /**
     *
     * @param entity
     */
    @Override
    public void persist(library entity) {
        em.persist(entity);
    }

    /**
     *
     * @param entity
     */
    @Override
    public void merge(library entity) {
        em.merge(entity);
    }

    /**
     *
     * @param entity
     */
    @Override
    public void remove(library entity) {
        library uni = em.find(library.class, entity.getId());
        em.remove(uni);
    }

    @Override
    public List<library> findAll() {
        return (List<library>) em.createQuery("SELECT u FROM library u").getResultList();
    }

    /**
     *
     * @param firstResult
     * @param maxResults
     * @return
     */
    @Override
    public List<library> findInRange(int firstResult, int maxResults) {
        return em.createQuery("SELECT u from library u").setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }

    /**
     *
     * @return
     */
    @Override
    public long count() {
        return (Long) em.createQuery("SELECT count(u) FROM library u").getSingleResult();
    }

    /**
     *
     * @param propertyName
     * @param propertyValue
     * @return
     */
    @Override
    public library getByPropertyName(String propertyName, String propertyValue) {
        List<library> list = em.createQuery("SELECT u FROM  library u WHERE u." + propertyName + "=?1").setParameter(1, propertyValue).getResultList();
        return (list.isEmpty()) ? null : list.get(0);
    }

    /**
     *
     * @param propertyName
     * @param propertyValue
     * @return
     */
    @Override
    public List<library> getEntitiesByProperName(String propertyName, String propertyValue) {
        List<library> list = em.createQuery("SELECT u FROM  library u WHERE u." + propertyName + "=?1").setParameter(1, propertyValue).getResultList();
        return list;
    }
    
}
