package string;

import java.util.Scanner;

public class count_vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        String x = sc.nextLine();
        int count = 0;

        for (int i = 0; i < x.length(); i++) {
            char ch = x.charAt(i);
            if (isvowel(ch) == true) count++;
        }
        System.out.println(count);
    }
        public static boolean isvowel ( char ch ){
        if (ch == 'a' || ch == 'A') return true;
        if (ch == 'o' || ch == 'O') return true;
        if (ch == 'i' || ch == 'I') return true;
        if (ch == 'u' || ch == 'U') return true;
        if (ch == 'e' || ch == 'E') return true;

        return false;
    }
}
