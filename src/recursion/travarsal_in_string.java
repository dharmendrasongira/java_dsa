package recursion;

public class travarsal_in_string {
    public static void print(int i,String x){
    if (i==x.length())return;
    System.out.print(x.charAt(i)+" ");
    print(i+1,x);
}
    public static void main(String[] args) {
   String x= "dharmendra songira";
        print( 0,x);
    }
}


