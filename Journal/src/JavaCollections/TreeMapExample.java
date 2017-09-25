package JavaCollections;

import java.util.TreeMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;

public class TreeMapExample {

    public static void main(String args[]) {

        //How to declare TreeMap
        TreeMap<Integer, String> tmap
                = new TreeMap<Integer, String>();

        //Adding elements to TreeMap
        tmap.put(1, "Red");
        tmap.put(100, "Blue");
        tmap.put(50, "Orange");
        tmap.put(10, "Purple");
        tmap.put(5, "Grey");

        //Display content using Iterator*/
        Set set = tmap.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry mentry = (Map.Entry) iterator.next();
            System.out.print("key " + mentry.getKey() + " Value is: ");
            System.out.println(mentry.getValue());
        }

    }
}
