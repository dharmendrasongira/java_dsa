package Tree;






//ALREADY MADE IN NODE OF TREE
//class node{
//    int val;
//    node left;
//    node right;
//    node(int val){
//        this.val=val;
//    }
//}
public class SUM_OF_TREE  {
    public static int sum(node temp){
        if(temp==null)return 0 ;
      int sum= temp.val+ sum(temp.left) +sum(temp.right);
   return sum;
    }
    public static void main(String[] args) {
        node a= new  node(1) ;
        node b= new  node(2) ;
        node c= new  node(3) ;
        node d= new  node(4) ;
        node e= new  node(5) ;
        node f= new  node(6) ;

        a.left=b; a.right=c;
        b.left=d;  b.right=e;
        c.right=f;
        System.out.println(sum(a));
//
//        System.out.println(a.val);
//        System.out.println(a.left.right.val);



    }

}

