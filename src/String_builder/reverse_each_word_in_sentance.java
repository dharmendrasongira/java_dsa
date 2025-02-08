package String_builder;

import java.util.Scanner;

public class reverse_each_word_in_sentance {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        StringBuilder x = new StringBuilder(sc.nextLine());
        int n= x.length();
        int i=0, j=0;

       while(j<n ){
           if (x.charAt(j)!=' ')j++;
           else{ reverse(x,i,j-1);
           i=j+1;
           j=i;
           }
       }reverse(x,i,j-1);//for last word
        System.out.println(x);
    }

    public static void reverse (StringBuilder sb,int i ,int j) {
        while(i<=j){
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));/////    sb.setCharAt(i)=sb.setCharAt(i)=;
            sb.setCharAt(j,temp);
            i++;
            j--;
        }

    }
}
