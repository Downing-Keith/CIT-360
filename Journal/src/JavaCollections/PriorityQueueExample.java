package JavaCollections;

import java.util.Iterator;
import java.util.PriorityQueue;

/*
 *
 * @author Keith Downing
 */
public class PriorityQueueExample {

    public static void main(String args[]) {
        // Creating empty priority queue
        PriorityQueue<String> pQueue
                = new PriorityQueue<String>();

        // Adding items to the pQueue
        pQueue.add("Jake");
        pQueue.add("Rudy");
        pQueue.add("Keith");
        pQueue.add("Alejandro");

        // Printing the most priority element
        System.out.println("First value using peek function:"
                + pQueue.peek());

        // Printing all elements
        System.out.println("The queue elements:");
        Iterator itr = pQueue.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
