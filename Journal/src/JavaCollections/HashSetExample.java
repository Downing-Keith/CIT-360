package JavaCollections;

import java.util.HashSet;
import java.util.Iterator;

/*
 *
 * @author Keith Downing
 */
public class HashSetExample {

    public static void main(String args[]) {
        //Creating the HashSet and adding elements  
        HashSet<String> set = new HashSet<String>();
        set.add("Keith");
        set.add("Alejandro");
        set.add("Rudy");
        set.add("Jake");
        //Traversing elements  
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}

//Elements in HashSet are returned in random order.