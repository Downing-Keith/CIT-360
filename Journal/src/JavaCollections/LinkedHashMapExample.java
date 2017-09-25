package JavaCollections;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/*
 *
 * @author Keith Downing
 */
public class LinkedHashMapExample {
     public static void main(String args[]) {
         // LinkedHashMap Declaration
         LinkedHashMap<Integer, String> lhmap = 
                 new LinkedHashMap<Integer, String>();

         //Adding elements to LinkedHashMap
         lhmap.put(2, "Red ");
         lhmap.put(3, "Blue ");
         lhmap.put(1, "Purple ");
         lhmap.put(4, "Orange ");
         lhmap.put(10, "Pink ");

         // Generating the Set of entries
         Set set = lhmap.entrySet();

         // Displaying the elements of LinkedHashMap
         Iterator iterator = set.iterator();
         while(iterator.hasNext()) {
            Map.Entry me = (Map.Entry)iterator.next();
            System.out.print("Key #: "+ me.getKey() + ", " +
                    " Value is: "+me.getValue()+"\n");
         }
    }
}

//Values returned are in the same order that they were inserted.