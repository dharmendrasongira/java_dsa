package String_builder;

import javax.print.DocFlavor;
import java.util.Arrays;
import java.util.Scanner;

public class sorting_a_string {
    public static void main(String[] args) {
        String s= "dharmendra";
        char[]ch=s.toCharArray();
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