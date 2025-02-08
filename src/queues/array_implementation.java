package queues;

import java.util.LinkedList;
import java.util.Queue;

public class array_implementation {
    public static class queue{
      static   int[] arr= new int[100];
       static int  f=-1;
       static int r=-1;

       static int size=0;

        public void add(int val){
            if (r== arr.length-1){ System.out.println("queue is full");return;}
            if (f==-1){f=r=0;}
            else{
                arr[r+1]=val;      //or you can write arr[++r]
                r++;
            }size++;

        }
        public static int remove (){
            if(size==0) System.out.println("queue is empty");
            f++;
            size--;
            return arr[f-1];
        }
        public int peek(){
            if(size==0) System.out.println("queue is empty");
            return arr[f];
        }
        public boolean isEmpty(){
            if (size==0) return true;
            else  return false;

        }
        public static void display(){
            if(size==0) System.out.println("queue is empty");
            for (int i = f; i <r ; i++) {
                System.out.println(arr[i]+" ");

            }
        }
    }
    public static void main(String[] args) {
  queue ok= new queue();

    }
}
