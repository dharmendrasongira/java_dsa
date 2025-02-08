package stacks;




class node{
        int val;
        node (int val){
            this.val=val;
        }
        node next;

     }


  class stack{
        node head=null;

        int size=0;


      void displayrec(node temp) {

          if (temp==null)return;
          displayrec(temp.next);
          System.out.println(temp.val+" ");
      }
      void display(){
          displayrec(head);
          System.out.println();
      }
        void displayrev(){
            node temp = head;
            while (temp != null) {
                System.out.print(temp.val+ " ");
                temp = temp.next;
            }
            System.out.println();
        }


        public void push(int value){
           node temp =new node(value);
           temp.next= head;
            head=temp;

            size++;}
         int size(){
            return size;
         }
         boolean isempty(){
             if (head==null) return true;
             return false;
         }
        public int peek( ){
        if (head==null){ System.out.println( "stack is empty");return -1;}
            int top =head.val;
        return top;
        }
         int pop(){
            if (head==null){ System.out.println( "stack is empty");}

      int top=head.val;
      head=head.next;
             size--;
        return top;

        }

    }
    public class linkedlist_implimentation {
        public static void main(String[] args) {
            stack st = new stack();
            st.push(10);
            st.push(20);
            st.push(30);
            st.push(40);
            st.display();
            System.out.println(st.size());

            System.out.println(st.isempty());
            System.out.println(st.peek());
            System.out.println(   st.pop());
            System.out.println(st.pop());
            st.display();


        }
    }