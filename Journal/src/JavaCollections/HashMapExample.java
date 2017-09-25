
package JavaCollections;

import java.util.HashMap;
import java.util.Map;

/*
 *
 * @author Keith Downing
 */
public class HashMapExample {

    public static void main(String[] args) {
        //Creating HashMap Example
        Map<String, String> Map = new HashMap<String, String>();
        //Adding items to the map
        Map.put("Name", "Link");
        Map.put("Level", "99");
        Map.put("Type", "Legendary");
        Map.put("Location", "Kinto Region");
        //Printing out items added to the map.
        System.out.println("Elements of the HashMap:");
        System.out.println(Map);
    }
}


//Source help; https://www.javatpoint.com/java-hashtable