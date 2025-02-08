package String_builder;

import java.util.Scanner;

public class togglechar {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        StringBuilder b= new StringBuilder(sc.nextLine());
        for (int i = 0; i <b.length() ; i++) {
            char ch = b.charAt(i);
            int ascii=(int)ch;

            if (ascii>=65 && ascii<=90){
                ascii +=32;
                ch = (char)ascii;
                b.setCharAt(i,ch);
            }

            else if (ascii>= 97 && ascii<= 122){
                ascii -=32;
                ch=(char)ascii;
                b.setCharAt(i,ch);
            }

        }
        System.out.print(b);
    }
}
