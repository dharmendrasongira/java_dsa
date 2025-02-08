package queues.question;
import java.util.*;
///
//leetcode -->232
//
public class queue_using_stack_push_efficient {
   public static class MyQueue {
        Stack<Integer> st = new Stack<>();
        Stack<Integer> gt = new Stack<>();

        public MyQueue() {

        }

        public void push(int x) {

            st.push(x);
        }

        public int pop() {
            while (st.size() > 1) {
                gt.push(st.pop());
            }
            int ans = st.pop();
            while (!gt.isEmpty()) {
                st.push(gt.pop());
            }
            return ans;
        }

        public int peek() {
            while (st.size() > 1) {
                gt.push(st.pop());
            }
            int ans = st.peek();
            while (!gt.isEmpty()) {
                st.push(gt.pop());
            }
            return ans;

        }
        public void display(){
            while(!st.empty()){
              gt.push(st.pop());
            }
            while(!gt.empty()){
                int val = gt.pop();
                System.out.println(val);
                st.push(val);
            }

        }

        public boolean empty() {
            if (st.size() == 0) return true;
            else return false;
        }
    }

    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.push(1);
        q.push(2);
        q.push(3);
     q.push(4);
      q.display();
        System.out.println(q.pop());
        System.out.println(q.empty());

   }
}
/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
