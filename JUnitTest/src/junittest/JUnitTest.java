/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junittest;

import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Keith Downing
 */
public class JUnitTest {

    @Test		
    public void testAssert(){					
        		
        //Variable declaration		
        String string1="Keith";					
        String string2="Keith";					
        String string3="CIT360";					
        String string4="CIT360";					
        String string5=null;					
        int variable1=1;					
        int variable2=2;					
        int[] airethematicArray1 = { 1, 2, 3 };					
        int[] airethematicArray2 = { 1, 2, 3 };					
        		
        //Assert statements
        
        
        // Asserts Equals
        assertEquals(string1,string2);	
        System.out.println("Assert Equals; string1 = string2"); 
        // Asserts Same
        assertSame(string3, string4);
        System.out.println("Assert Same: string3 is the same as string4"); 
        // Asserts Not Same
        assertNotSame(string1, string3);		
        System.out.println("Assert Not Same: string1 is not the same as string3"); 
        // Asserts Not Null
        assertNotNull(string1);			
        System.out.println("Assert Not Null; string1 is not null"); 
        // Asserts Null
        assertNull(string5);			
        System.out.println("Assert Nu; string5 is set null"); 
        // Asserts True
        assertTrue(variable1<variable2);		
        System.out.println("Assert True: variable1 is less than variable2"); 
        // Asserts False
        assertFalse(variable1>variable2);		
        System.out.println("Assert False: variable1 is greater than variable2"); 
        // Asserts Array Equals
        assertArrayEquals(airethematicArray1, airethematicArray2);					
 	System.out.println("Assert Array: airethematicArray1 is equal to array airethematicArray2"); 
        
        // Asserts That
        assertThat(variable1, is("abc"));
        
        
        //
    
    }
}
