
package JavaCollections;

import java.util.Hashtable;
import java.util.Map;

/**
 *
 * @author Keith Downing
 */
public class HashTableExample {
    public static void main(String args[]){
        //Creates and will populate the HashTable
  Hashtable<Integer,String> hm=new Hashtable<Integer,String>();  
        //Adds entries to the Table
  hm.put(1,"Keith");  
  hm.put(2,"Rudy");  
  hm.put(3,"Alejandro");  
  hm.put(4,"Jake");  
        //Traversing the map
  for(Map.Entry m:hm.entrySet()){  
   System.out.println(m.getKey()+" "+m.getValue());  
  }  
 }  
}
