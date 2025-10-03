package Exception_and_file_handeling.file;

import java.util.*;

public class queueExample {
    static void main(String[] args) {
        Queue<String> q = new LinkedList<>();

        q.offer("A");
        q.offer("B");
        q.offer("C");

        System.out.println("Queue: " + q);

        System.out.println("Head: " + q.peek());

        System.out.println("Removed: " + q.poll());
        System.out.println("Queue after poll: " + q);

        System.out.println("Removed: " + q.remove());

        System.out.println("Final Queue: " + q);
    }
}
