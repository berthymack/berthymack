/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.berthy.repository.REPOS;

import com.berthy.library.library;
import java.util.List;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author admin
 */
public class libraryREPOSNGTest {
    
    public libraryREPOSNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of find method, of class libraryREPOS.
     */
    @Test
    public void testFind() {
        System.out.println("find");
        Long id = null;
        libraryREPOS instance = new libraryREPOS();
        library expResult = null;
        library result = instance.find(id);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of persist method, of class libraryREPOS.
     */
    @Test
    public void testPersist() {
        System.out.println("persist");
        library entity = null;
        libraryREPOS instance = new libraryREPOS();
        instance.persist(entity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of merge method, of class libraryREPOS.
     */
    @Test
    public void testMerge() {
        System.out.println("merge");
        library entity = null;
        libraryREPOS instance = new libraryREPOS();
        instance.merge(entity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class libraryREPOS.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        library entity = null;
        libraryREPOS instance = new libraryREPOS();
        instance.remove(entity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findAll method, of class libraryREPOS.
     */
    @Test
    public void testFindAll() {
        System.out.println("findAll");
        libraryREPOS instance = new libraryREPOS();
        List expResult = null;
        List result = instance.findAll();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findInRange method, of class libraryREPOS.
     */
    @Test
    public void testFindInRange() {
        System.out.println("findInRange");
        int firstResult = 0;
        int maxResults = 0;
        libraryREPOS instance = new libraryREPOS();
        List expResult = null;
        List result = instance.findInRange(firstResult, maxResults);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of count method, of class libraryREPOS.
     */
    @Test
    public void testCount() {
        System.out.println("count");
        libraryREPOS instance = new libraryREPOS();
        long expResult = 0L;
        long result = instance.count();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getByPropertyName method, of class libraryREPOS.
     */
    @Test
    public void testGetByPropertyName() {
        System.out.println("getByPropertyName");
        String propertyName = "";
        String propertyValue = "";
        libraryREPOS instance = new libraryREPOS();
        library expResult = null;
        library result = instance.getByPropertyName(propertyName, propertyValue);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEntitiesByProperName method, of class libraryREPOS.
     */
    @Test
    public void testGetEntitiesByProperName() {
        System.out.println("getEntitiesByProperName");
        String propertyName = "";
        String propertyValue = "";
        libraryREPOS instance = new libraryREPOS();
        List expResult = null;
        List result = instance.getEntitiesByProperName(propertyName, propertyValue);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
