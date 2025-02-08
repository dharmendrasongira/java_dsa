package queues.question;
//leet code --225
import java.util.*;
public class stack_using_queue_push_efficient {
    //push efficient matalab jaldise kam time complexity me push hojayeye o(1)baki pop or pee
    public static class MyStack {
        Queue<Integer>q=new LinkedList<>();

        public void push(int x) {
            q.add(x);
        }

        public int pop() {


            for (int i =1;i<=q.size()-1;i++){
                q.add(q.remove());
            }//4123
            int x= q.remove();//4
            return x;
        }

        public int top() {
            for (int i =1;i<=q.size()-1;i++){
                q.add(q.remove());
            }//4123
            int x= q.peek();//4
            q.add(q.remove());//1234
            return x;

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
        MyStack st= new MyStack();
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
