package Week13;

import java.util.LinkedList;
import java.util.Queue;

public class QueueSection {

    public static void main(String[] args) {
        Queue<String>queue= new LinkedList<>();
        queue.add("Taylan");
        queue.add("Gulay");
        queue.add("Seray");
        queue.add("Tonka");


        System.out.println(queue);

        // Poll is removed the first index

        queue.poll();
        System.out.println(queue);

        System.out.println("***********");

        queue.offer("Taylan");
        System.out.println(queue);
        System.out.println("***********");

    }
}
