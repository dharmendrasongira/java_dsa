package Linked_List;
class node{
    node next;
    int value;
    node (int value ){
        this.value=value;
    }
}
public class node_class {
    public static void main(String[] args) {
        node a= new node(10);
        node b= new node(20);
        node c= new node(30);
        node d= new node(40);

        ////linking
        a.next=b;//10->20
        b.next=c;//10->20->30
        c.next=d;//10->20->30->40


        //printing
        System.out.println(a.value);
        System.out.println(b.value);
        System.out.println(c.value);
        System.out.println(d.value);

        ///or
        System.out.println(a.value);
        System.out.println(a.next.value);
        System.out.println(a.next.next.value);
        System.out.println(a.next.next.next.value);

    }

}
