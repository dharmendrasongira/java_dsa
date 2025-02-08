package queues.question;

import java.util.LinkedList;
import java.util.Queue;

public class stack_using_queue_pop_peek_efficient {


        //push efficient matalab jaldise kam time complexity me push hojayeye o(1)baki pop or pee
        public static class MyStack {
            Queue<Integer> q=new LinkedList<>();

            public void push(int x) {
                if(q.size()==0)q.add(x);
                else{
                    q.add(x);
                for (int i =1;i<=q.size()-1;i++){
                    q.add(q.remove());
                }}

            }

            public int pop() {
                int val= q.remove();
                return val;
            }

            public int top() {
            return q.peek();

            }
            public void display(){
                System.out.println(q);
            }

            public boolean empty() {
                if(q.size()==0)return true;
                else return false;
            }
        }

        public static void main(String[] args) {
            queues.question.stack_using_queue_push_efficient.MyStack st= new queues.question.stack_using_queue_push_efficient.MyStack();
            System.out.println(st.empty());
            st.push(1);
            st.push(2);
            st.push(3);
            st.push(4);
            st.display();
            st.pop();
            System.out.println(st.top());
            System.out.println(st.empty());
        }
/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
    }

