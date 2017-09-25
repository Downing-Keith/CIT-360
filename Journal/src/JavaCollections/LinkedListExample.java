package JavaCollections;

import java.util.Iterator;
import java.util.LinkedList;

/*
 *
 * @author Keith Downing
 */
public class LinkedListExample {

    public static void main(String args[]) {
        //Creating the LinkedList
        LinkedList<String> al = new LinkedList<String>();
        //Adding the elements to the LinkedList
        al.add("Rudy");
        al.add("Keith");
        al.add("Rudy");
        al.add("Jake");
        al.add("Alejandro");

        Iterator<String> itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}

//LinkedList is able to have duplicates. "Rudy"

//Insertion order maintained.
