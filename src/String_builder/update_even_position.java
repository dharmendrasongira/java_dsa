package String_builder;

import java.util.Scanner;

public class update_even_position {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your string");
        String x = sc.nextLine();
        String ans = "";
        for (int i = 0; i < x.length(); i++) {

            if (i % 2 == 0) {
                ans += 'a';
            } else ans += x.charAt(i);
        }
        System.out.println(ans);
    }
}