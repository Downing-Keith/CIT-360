/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junittest;

import com.sun.net.httpserver.Authenticator.Failure;
import com.sun.net.httpserver.Authenticator.Result;

/**
 *
 * @author Keith Downing
 */
public class JUnitTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Result result = JUnitCore.runClasses(JUnitTest.class);					
			for (Failure failure : result.getFailures()) {							
         System.out.println(failure.toString());					
      }		
      System.out.println("Result=="+result.wasSuccessful());	
    }
    
}
