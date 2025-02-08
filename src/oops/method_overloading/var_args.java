package oops.method_overloading;
 class  calculatorg{
     /// method over loding same argument type but different argument count
     public void add(int a,int b){
         System.out.println(a+b);
     }
     public void add(int a,int b,int c){
         System.out.println(a+b+c);
     }
     public void add(int a,int b,int c,int d){
         System.out.println(a+b+c+d);
     }
     public void add(int a,int b,int c,int d,int e){
         System.out.println(a+b+c+d+e);
     }
 }
 ////alternate method
 class advancecalculator{


     // var--args  0to n
     public void add(int...args){
         int sum=0;
         for (int data:args){
             sum +=data;
         }
         System.out.println( sum);
     }
 }
public class var_args {
    public static void main(String[] args) {
        calculatorg c=new calculatorg();
        c.add(2,5);
        c.add(1,5,6);
        c.add(1,5,5,6);
        c.add(1,1,1,1,1);
        System.out.println();



        advancecalculator ac=new advancecalculator();
        ac.add(2,5);
        ac.add(1,5,6);
        ac.add(1,5,5,6);
        ac.add(1,1,1,1,1);
        ac.add();
        ac.add(5,6,8);
    }
    }




