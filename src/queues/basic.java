package queues;
import java.util.*;
public class basic {
    public static void main(String[] args) {
        Queue<Integer> q= new LinkedList<>();

        q.add(10);
        q.add(20);
        q.add(30);
        System.out.println(q);
        q.remove();
        q.poll();//same q.remove
        System.out.println( q.size());
         q.add(40);
        System.out.println(q);
        System.out.println( q.peek());
        System.out.println(q.element());//same as peek()
        System.out.println(q.isEmpty());

    }
}
