package recursion;

public class string_alphabet {

    public static void print(int i,String x,String ans){
        if (i==x.length()) {
            System.out.println(ans);
            return;
        }
       if (x.charAt(i)!='a') ans += x.charAt(i);
        print(i+1,x,ans);
    }
    public static void main(String[] args) {
        String x= "dharmendra songira";
        print( 0,x,"");
    }
}

