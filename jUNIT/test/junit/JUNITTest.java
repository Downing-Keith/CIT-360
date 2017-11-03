/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Keith Downing
 */
public class JUNITTest {
    
    public JUNITTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of add method, of class JUNIT.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        String s1 = "2";
        String s2 = "2";
        JUNIT instance = new JUNIT();
        int expResult = 4;
        //call to add
        int result = instance.add(s1, s2);
        assertEquals(expResult, result);
    }
    @Test
    public void testAdd2() {
        System.out.println("add");
        String s1 = "2";
        String s2 = "3";
        JUNIT instance = new JUNIT();
        int expResult = 5;
        //call to add
        int result = instance.add(s1, s2);
        assertEquals(expResult, result);
    }
    @Test(expected=NumberFormatException.class)
    public void testAdd3() {
        System.out.println("add");
        String s1 = "Keith";
        String s2 = "2";
        JUNIT instance = new JUNIT();
        //call to add
        int result = instance.add(s1, s2);

    }
}
