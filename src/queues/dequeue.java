package queues;



import java.util.*;

    public class dequeue{
        public static class node{
            int val;
         node next;
         node prev;
            node (int val){
                this.val =val;
            }

        }
        public static class queuell{
           node head= null;
            node tail=null;
            node prev=null;
            int size=0;
            public void add(int x){
                node temp =new node(x);
                if(size==0){
                    head= temp;
                    tail =temp;
                    prev=temp;
                }
                else{
                    tail.next=temp;
                    tail=temp;}
                size++;

            }
            public void addLast(int x){
                node temp =new node(x);
                if(size==0){
                    head= temp;
                    tail =temp;
                    prev= temp;
                }
                else{
                    tail.next=temp;
                    tail=temp;}
                size++;

            }
            public void addFirst(int x){
                node temp =new node(x);
                if(size==0){
                    head= temp;
                    tail =temp;
                    prev=temp;
                }
                else{
                    head.prev=temp;
                    head=temp;}
                size++;

            }

            public int remove(){
                if (size==0){
                    System.out.println("queue is empty");
                    return -1;
                }
                int x= head.val;
                head=head.next;
                size--;
                return x;
            }
            public int removeLast(){
                if (size==0){
                    System.out.println("queue is empty");
                    return -1;
                }
                int x= tail.val;
                tail=tail.prev;
                size--;
                return x;
            }
            public int removeFirst(){
                if (size==0){
                    System.out.println("queue is empty");
                    return -1;
                }
                int x= head.val;
                head=head.next;
                size--;
                return x;
            }

            public int peek(){
                if (size==0){
                    System.out.println("queue is empty");
                }
                return head.val;
            }
            public void removeall (){
             head=null;
             tail=null;
             prev=null;
            }
            public void display (){
                if (size==0){
                    System.out.println("queue is empty");
                }
                node temp = head;
                while(head.next!=null){
                    System.out.print(temp +" ");
                    temp =  temp.next;
                }

            }
            public boolean isempty(){
                if (size==0){
                    return true;}
                return false;

            }

        }
        public static void main(String[] args) {
            queues.linked_list_implementation.queuell q1= new queues.linked_list_implementation.queuell();
            System.out.println(q1.isempty());
            q1.add(1);
            q1.add(2);
            q1.add(3);
            q1.add(4);
            q1.add(5);
            System.out.println(q1.size);
            q1.display();


        }
    }


