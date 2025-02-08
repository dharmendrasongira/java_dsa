package String_builder;

import java.util.Scanner;

public class isomorphic_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        isisomorphic( s,t );
        if (isisomorphic( s,t )==true) System.out.println("given strings iosmorphic ");
       else if (isisomorphic( s,t )==false) System.out.println("given strings not iosmorphic ");

    }


    public static boolean isisomorphic(String s, String t) {
        char[] a = new char[128];

        for (int i = 0; i <s.length(); i++) {
            char ch = s.charAt(i);
            char dh = t.charAt(i);
            int index= (int)ch;
            if (a[index]=='\0')a[index]=dh;
            else {
                if (a[index]!=dh)return false;
            }
        }
        char[] b = new char[128];
        for (int i = 0; i <s.length(); i++) {
            char ch = t.charAt(i);
            char dh = s.charAt(i);
            int index= (int)ch;
            if (b[index]=='\0')b[index]=dh;
            else {
                if (b[index]!=dh)return false;
            }
        }
        return true;


    }
}