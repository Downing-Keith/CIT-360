package JavaCollections;

import java.util.ArrayList;
import java.util.Iterator;

/*
 *
 * @author Keith Downing
 */
public class ArrayListExample {

    public static void main(String args[]) {
        //Creation of ArrayList
        ArrayList<String> obj = new ArrayList<String>();

        //This is how elements should be added to the array list
        obj.add("Keith");
        obj.add("Jake");
        obj.add("Rudy");
        obj.add("Alejandro");

        //Displaying array list elements
        System.out.println("ArrayList:" + obj);

    }
}

//Insertion order maintained.