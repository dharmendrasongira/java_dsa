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
public class  PRODUCT_OF_TREE_NODE {
    public static int product(node temp){
        if(temp==null)return 1 ;
        if (temp.val == 0) return product(temp.left) * product(temp.right);
        int product= temp.val * product(temp.left) *product(temp.right);
        return product;
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
        System.out.println(product(a));
//
//        System.out.println(a.val);
//        System.out.println(a.left.right.val);



    }

}


