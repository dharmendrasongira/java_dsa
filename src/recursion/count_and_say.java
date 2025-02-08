package recursion;

import java.util.Scanner;

public class count_and_say {
public static String countandsay(int n){
    if (n==1)return "1";
    String S=countandsay(n-1)+"@";
    String ans= "";
    int i=0,j=0;
    while(j<S.length()){
        if (S.charAt(i)==S.charAt(j))j++;
        else{
            int length= j-i;
            ans +=length;
            ans +=S.charAt(i);
            i =j;
        }

    }return ans;
}
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(countandsay(n));

    }}
