package String_builder;

import java.util.Arrays;

public class sort_string_builder {  public static void main(String[] args) {
    StringBuilder s= new StringBuilder("dharmendra");

    String X=s.toString();// string builder se string mee

    char[]ch=X.toCharArray();// string se charachter array me

    for(char ele :ch){
        System.out.print(ele);
    }
    System.out.println();

    Arrays.sort(ch);//built in sort

    for(char ele :ch){
        System.out.print(ele);
    }
    System.out.println();
}
}

