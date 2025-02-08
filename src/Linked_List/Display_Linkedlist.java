package Linked_List;
///classs node is accesed in package so directly

public class Display_Linkedlist {
    ///method for printing
    public static void print(node head ){
        node temp3= head;

        // jaha se print karna usko head bana do
        while (temp3!=null){ //jab tak temp me null na ajeye matlab last tak chalega
            System.out.print(temp3.value + " ");
            temp3=temp3.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        node a = new node(10);
        node b = new node(20);
        node c = new node(30);
        node d = new node(40);


        a.next=b;//10->20
        b.next=c;//10->20->30
        c.next=d;//10->20->30->40


       node temp6 = a;//shallow copy matlab naya ni bana joo a hai usko point kar raha hai temp
        //shallow copy  agar hum temp ko change karenge toh abhi change hoga or us a ki value bhi get kar skte

       node temp5 = new node(0);// deep copy new bana temp1

        //print puri linked list using for loop jab size pata ho

        node temp1=a;//head point karo temp me
        for (int i=0; i<=3;i++) {
            System.out.print(temp1.value +" ");
            temp1 = temp1.next;//matalab a ke next ki value daal doo}

        }
        System.out.println();



            // jab size na paat ho
            //using while loop
            node temp;
            temp=a;//head pointing
            // jaha se print karna usko head bana do
            while (temp!=null){ //jab tak temp me null na ajeye matlab last tak chalega
                System.out.print(temp.value+" ");
                temp=temp.next;
            }
           System.out.println();
            print(a);
        }


    }

