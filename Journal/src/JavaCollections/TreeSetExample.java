package JavaCollections;

import java.util.TreeSet;

/*
 *
 * @author Keith Downing
 */
public class TreeSetExample {

    public static void main(String args[]) {
        // TreeSet of String Type
        TreeSet<String> tset1 = new TreeSet<String>();

        // Adding elements to TreeSet<String>
        tset1.add("A");
        tset1.add("B");
        tset1.add("C");
        tset1.add("D");
        tset1.add("E");
        tset1.add("F");

        //Displaying TreeSet
        System.out.println(tset1);

        // TreeSet of Integer Type
        TreeSet<Integer> tset2 = new TreeSet<Integer>();

        // Adding elements to TreeSet<Integer>
        tset2.add(1);
        tset2.add(2);
        tset2.add(3);
        tset2.add(4);
        tset2.add(5);
        tset2.add(6);
        System.out.println(tset2);
    }
}

//Sorts the elements in ascending order.
