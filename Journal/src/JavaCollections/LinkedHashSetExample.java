package JavaCollections;

import java.util.LinkedHashSet;
import java.util.TreeSet;

/*
 *
 * @author Keith Downing
 */
public class LinkedHashSetExample {
    public static void main(String args[]) {
         // LinkedHashSet String Type
         LinkedHashSet<String> lhset = new LinkedHashSet<String>();

         // Adding elements to the LinkedHashSet
         lhset.add("Q");
         lhset.add("R");
         lhset.add("A");
         lhset.add("C");
         lhset.add("M");
         lhset.add("O");
         System.out.println(lhset);

         // LinkedHashSet Integer Type
         LinkedHashSet<Integer> lhset2 = new LinkedHashSet<Integer>();

         // Adding elements
         lhset2.add(50);
         lhset2.add(10);
         lhset2.add(0);
         lhset2.add(5);
         lhset2.add(100);
         lhset2.add(2);
         System.out.println(lhset2);
    }
}

//Data is in the insertion order