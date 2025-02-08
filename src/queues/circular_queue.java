package queues;



public class circular_queue {
    public static class  cqa{
        int front=-1;
        int rear =-1;
        int size =0;
        int []arr=new int [6];
        public void add(int val){
            if (size== arr.length){
                System.out.println("queue is full");

            }
         else  if (size == 0) {

                arr[0]=val;
                rear=0;
                front = 0;

         }

           else if(rear<arr.length-1){
                arr[++rear]=val;

            }
            else  if(rear == arr.length-1){
                arr[0]=val;
                rear=0;

            }
            size++;
        }
        public int remove(){
            if (size==0){
                System.out.println("queue is empty");
                return -1;
            }

            else {int val = arr[front];
                if (front == arr.length - 1) front =0;
                else front++;
                size--;
                return val;
            }

        }
        public int peek ()throws Exception{
            if (size==0){
                throw new Exception("queue is empty");
            }
            else return rear;

        }

        public boolean isempty(){
            if (size==0){
                return true;
            }
       else return false;
        }
        public void display() {
                if (size==0){
                    System.out.println("queue is empty");
                }
                else {
                    if (front<=rear){
                        for (int i = front; i <= rear; i++) {
                            System.out.print(arr[i]+" ");
                        }}
                       else if (rear<= front){
                            for (int i = front; i <=arr.length-1 ; i++) {
                                System.out.print(arr[i]+" ");}
                                for (int j = 0; j <= rear; j++) {
                                    System.out.print(arr[j]+" ");
                                }
                    }
                    System.out.println();
                }
        }
    }

    public static void main(String[] args) {
        cqa q= new cqa();
        q.display();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
 q.display();
        System.out.println(q.remove());
q.display();
q.add(5);
q.add(6);
q.display();
q.add(5);
q.display();
q.add(1);
q.display();
        for (int i = 0; i < q.arr.length; i++) {
            System.out.print(q.arr[i]+" ");
        }
    }
}
