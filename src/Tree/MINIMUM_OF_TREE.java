package Tree;

public class MINIMUM_OF_TREE {

//ALREADY MADE IN NODE OF TREE
//class node{
//    int val;
//    node left;
//    node right;
//    node(int val){
//        this.val=val;
//    }
//}

    public static int mini(node temp){
        if(temp==null)return Integer.MAX_VALUE ;

        int ans= Math.min(temp.val , Math.max( mini(temp.left) ,mini(temp.right)));
        return ans;
    }
    public static void main(String[] args) {
        node a= new  node(1) ;
        node b= new  node(2) ;
        node c= new  node(3) ;
        node d= new  node(42) ;
        node e= new  node(5) ;
        node f= new  node(6) ;

        a.left=b; a.right=c;
        b.left=d;  b.right=e;
        c.right=f;
        System.out.println(mini(a));
//
//        System.out.println(a.val);
//        System.out.println(a.left.right.val);



    }

}


