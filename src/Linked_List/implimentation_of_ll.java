package Linked_List;
//aim to create user defined linke list
///node class already avail

public class implimentation_of_ll {
 public static    class sll {


      node head;
 node tail;
      int size;

     void insertAtHead(int value) {
         node temp = new node(value);
         if (head == null) {//phela elment ho linked list ka
             head = tail = temp;
         } else {
             temp.next = head;
             head = temp;
         }
         size++;
     }

     void insertAtTail(int value) {
         node temp = new node(value);
         if (head == null) {//phela elment ho linked list ka
             head = tail = temp;
         } else {
             tail.next = temp;//jaha tail tha usko temp se link kiya
             tail = temp;//akhrii me add kiya islieye us temp ko hi tail bana diya
         }
         size++;
     }

     void display() {
         node temp = head;
         while (temp != null) {
             System.out.print(temp.value + " ");
             temp = temp.next;
         }
         System.out.println();
     }

     void size() {
         System.out.println("size of linked list is :" + size);
     }

     void InsertAt(int idx, int value) {
         if (idx == 0) {
             insertAtHead(value);//agar idx 0 hoga toh
             return;
         }
         if (idx == size) {
             insertAtTail(value);
             return;
         }

         if (idx > size) {
             System.out.println("invaild index !!!");
             return;
         }

         node temp = new node(value);
         node dummy = head;
         for (int i = 0; i < idx - 1; i++) {
             dummy = dummy.next;
         }
         temp.next = dummy.next;
         dummy.next = temp;
         size++;
     }

     int get(int idx) {
         if (idx >= size || idx < 0) {
             System.out.println("invaild index !!!");
             return -1;
         }
         if (idx == size - 1) {
             return tail.value;
         }

         node temp = head;
         for (int i = 1; i < idx; i++) {
             temp = temp.next;
         }
         return temp.value;
     }
     void set(int idx,int value) {
         if (idx >= size || idx < 0) {
             System.out.println("invaild index !!!");
             return ;
         }
         if (idx == size - 1) {
              tail.value=value;
         }

         node temp = head;
         for (int i = 1; i < idx; i++) {
             temp = temp.next;
         }
        temp.value=value;
     }
     void deleteAtHead()throws Error{
         if (head==null) throw new Error("list is already empty");
         head=head.next;
         size--;
     }
//     void deleteAtTail()throws Error{
//         if (head==null) throw new Error("list is already empty");
//         head=head.next;
//         size--;
//     }


     void deleteAt(int idx) {
         if (idx==0){
             deleteAtHead();
         }
         if (idx >= size || idx < 0) {
             System.out.println("invaild index !!!");
             return;
         }
         node temp = head;
         for (int i = 1; i < idx-1; i++) {
             temp = temp.next;
         }
         if (temp.next ==tail )tail=temp;
         temp=temp.next.next;
         size--;
     }
 }

    public static void main(String[] args) {
        sll list = new sll();
        list.size();
        //insertion at tail

      list.insertAtTail(50);
      list.insertAtTail(60);
      list.display();
      list.size();

        //insertion at head

      list.insertAtHead(6);
      list.insertAtHead(92);
      list.display();

         //insertion at particular index

      list.InsertAt(2,619);
      list.display();
      list.size();
       //get
        System.out.println( list.get(1));
             //delete at head
            list.deleteAtHead();

            //delete at particular index
        list.deleteAt(2);
      }
}
