package Linked_List;

public class display_by_recurssion {
    public static void print(node head){
        if (head==null) return;// base case
        System.out.print(head.value+" ");
        print(head.next);
    }
    public static void main(String[] args) {

        node a = new node(10);
        node b = new node(20);
        node c = new node(30);
        node d = new node(40);


        a.next=b;//10->20
        b.next=c;//10->20->30
        c.next=d;//10->20->30->40

        print(a);

    }
}
