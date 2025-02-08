package queues;
import java.util.*;
public class print {
    public static void main(String[] args) {
        Queue<Integer> q= new LinkedList<>();

        q.add(10);
        q.add(20);
        q.add(30);

        Queue<Integer> we= new LinkedList<>();
        while(q.size()>0){
            int re= q.remove();
            System.out.println(re);
            we.add(re);
        }
          while (we.size( )>0){
             int o= we.remove();
             q.add(o);
          }
      /// without using built in print  System.out.println(q);

    }
}
