package queues.question;

import java.util.Stack;


//leetcode -->232
//
    public class queue_using_stack_pop_efficient {
        public static class MyQueue {
            Stack<Integer> st = new Stack<>();
            Stack<Integer> gt = new Stack<>();

            public MyQueue() {

            }

            public void push(int x) {
                if (st.size() == 0) st.push(x);
                else {
                    while (!st.isEmpty()) {
                        gt.push(st.pop());
                    }
                    st.push(x);
                    while (!gt.isEmpty()){
                        st.push(gt.pop());
                    }
            }}
            public int pop() {
               int ans= st.pop();
                return ans;
            }

            public int peek() {
          return    st.peek();
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
            queues.question.queue_using_stack_push_efficient.MyQueue q = new queues.question.queue_using_stack_push_efficient.MyQueue();
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

