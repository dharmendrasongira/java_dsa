package Tree;


import com.sun.jdi.PathSearchingVirtualMachine;

import javax.swing.plaf.PanelUI;
import java.security.PublicKey;

//ALREADY MADE IN NODE OF TREE
//class node{
//    int val;
//    node left;
//    node right;
//    node(int val){
//        this.val=val;
//    }
//}
public class DISPLAY_A_TREE  {
   public static void display(node temp){
       if(temp==null)return;
       System.out.println(temp.val+" ");
       display(temp.left);
       display(temp.right);
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
        display(a);
//
//        System.out.println(a.val);
//        System.out.println(a.left.right.val);



    }

}

