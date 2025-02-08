package doubly_linkedlist;

//import Linked_List.node;//aleradyy basic class import hai
class DLL{
    dnode head;
    dnode tail;
    int size;
    public void display(){
        dnode temp =head;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp= temp.next;
        }
        System.out.println();
    }
    void  insertionathead(int val){
        dnode temp= new dnode(val);
        if (size ==0){head=tail= temp;}
        else {temp.next=head;
            head.prev=temp;
            head=temp;

        }
        size++;
    }
    void deleteathead(){
        if (head==null) System.out.println("00error");
        head=head.next;
        head.prev=null;
        size--;
    }
    void deleteattail(){
        if (head==null) System.out.println("00error");
        tail=tail.prev;
        tail.next=null;
size--;
    }
    void  deleteatindex(int idx ){


        if (idx==0){
            deleteathead();return;}
        if(idx==size){
           deleteattail();return;}
        if(idx>size||idx<0){
            System.out.println("invalid index");
            return;
        }
        dnode t1=head;
        dnode t2=head.next.next;
        for (int i = 1; i <=idx-1 ; i++) {
            t1= t1.next;
            t2= t2.next;
        }
        t1.next=t2;
        t2.prev=t1;
    }
    void  insertionatrandom(int idx,int val ){

        dnode temp= new dnode(val);
        if (idx==0){insertionathead(val); return;}
        if(idx==size){insertionattail(val);return;}
        if(idx>size||idx<0){
            System.out.println("invalid index");
            return;
        }
        dnode t1=head;
        dnode t2=head.next;
        for (int i = 1; i <=idx-1 ; i++) {
            t1= t1.next;
            t2= t2.next;
        }
        t1.next=temp;
        t2.prev=temp;
        temp.next=t2;
        temp.prev=t1;

        size++;
    }


    void  insertionattail(int val){
        dnode temp= new dnode(val);
        if (size ==0){head=tail= temp;}
        else {tail.next=temp;
            temp.prev=tail;
            tail=temp;
            tail.next=null;
        }
        size++;
}
int get(int idx) {
    if (idx >= size || idx < 0) {
        System.out.println("invaild index !!!");
        return -1;
    }
    if (idx == size - 1) {
        return tail.val;
    }

    dnode temp = head;
    for (int i = 1; i < idx; i++) {
        temp = temp.next;
    }
    return temp.val;
}
void set(int idx,int value) {
    if (idx >= size || idx < 0) {
        System.out.println("invaild index !!!");
        return ;
    }
    if (idx == size - 1) {
        tail.val=value;
    }

    dnode temp = head;
    for (int i = 1; i < idx; i++) {
        temp = temp.next;
    }
    temp.val=value;
}}
public class basic2 {//aleradyy basic class import hai

    public static void main(String[] args) {
        DLL list= new DLL();
        list.insertionattail(10);
        list.insertionattail(20);
        list.insertionattail(30);
        list.display();
        System.out.println(list.size);
        list.insertionathead(40);
      list.insertionathead(50);
      list.display();
        list.insertionatrandom(2,80);
        list.display();
        list.deleteatindex(2);
        list.display();
    }

}
