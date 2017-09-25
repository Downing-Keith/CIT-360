package JavaCollections;

import java.util.Enumeration;
import java.util.Vector;

/*
 *
 * @author Keith Downing
 */
public class VectorExample {

    public static void main(String args[]) {
        //Vector of initial capacity(size of 2)
        Vector<String> vec = new Vector<String>(2, 4);

        //Adding elements to a vector
        vec.addElement("Blue");
        vec.addElement("Orange");
        vec.addElement("Red");
        vec.addElement("Purple");

        /* check size and capacityIncrement*/
        System.out.println("Size is: " + vec.size());
        System.out.println("Default capacity increment is: " + vec.capacity());

        vec.addElement("Color");
        vec.addElement("Color1");
        vec.addElement("Color2");

        /*size and capacityIncrement after two insertions*/
        System.out.println("Size after addition: " + vec.size());
        System.out.println("Capacity after increment is: " + vec.capacity());

        //Display Vector elements
        Enumeration en = vec.elements();
        System.out.println("\nElements are:");
        while (en.hasMoreElements()) {
            System.out.print(en.nextElement() + " ");
        }
    }
}

/*
Initial capacity will be 2 and increment of 4 and 5th insertion the
value increased to 10.
*/
