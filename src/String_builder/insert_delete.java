package String_builder;

import java.util.Scanner;

public class insert_delete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb= new StringBuilder("abcd");
        System.out.println( sb);

        sb.deleteCharAt(2);//index 2 pe jo charchter hoga delet ho jayega
        System.out.println(sb);

        sb.insert(2,"afgtd");
        System.out.println(sb);

        sb.delete(2,4);
        System.out.println(sb);

        sb.insert(2,0);
        System.out.println(sb);


    }
}
