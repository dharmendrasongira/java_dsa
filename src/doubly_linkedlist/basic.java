package doubly_linkedlist;


    class dnode{
        int val;
        dnode next;
        dnode prev;
        dnode(int val){
            this.val=val;
        }


        public static class basic{
            public static void print( dnode head ){
                dnode temp= head;
                while(temp !=null){
                    System.out.println(temp.val+" ");
                    temp=temp.next;
                }
                System.out.println( );
            }

            public static void display( dnode node){

                dnode temp= node;
                while(temp.prev !=null){
                    temp=temp.prev;
            } print(temp);
            }
            public static void printreverse( dnode tail ){
                dnode temp= tail;
                while(temp !=null){
                    System.out.println(temp.val+" ");
                    temp= temp.prev;
                }
                System.out.println( );
            }

            public static void main(String[] args) {
                dnode a= new dnode(10);
                dnode b=new dnode(20);
                dnode c= new dnode(30);
                dnode d=new dnode(40);
                a.next =b;    b.prev=a;
                b.next= c;   c.prev=b;
                c.next=d;      d.prev=c;
                d.next=null;
            print(a);
            printreverse(d);
            display (c);
            }
        }
    }

