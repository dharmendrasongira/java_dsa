package stacks;

public class  array_implimentation {
    public static class stack {
        int idx = 0;
       private int[] arr = new int[5];

        public boolean isFull(){
           if (idx==arr.length) return true;
           return false;
        }
        public boolean isempty(){
            if (idx==0) return true;
            return false;
        }
        public void push(int val) {
          if (isFull()) System.out.println("stack is full");
            arr[idx] = val;
            idx++;
        }
        int peek(){
            if(idx==0){
                System.out.println("the stack is empty");
            }
            return arr[idx-1];
        }

        public int pop() {
            if (isempty()) {
                System.out.println("stack is empty");
            } else {
                int top = arr[idx - 1];
                arr[idx - 1] = 0;
                idx--;
                return top;
            }return 0;
        }
        public int size(){
            return idx;
        }
        public void display(){
            for (int i = 0; i <= idx-1; i++) {
                System.out.print(arr[i]+" ");

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        stack st= new stack();
        st.isempty();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.display();
        st.isFull();
        System.out.println(st.pop());
        st.pop();
        st.display();
        System.out.println(st.peek());
        System.out.println(  st.size());

    }
}
