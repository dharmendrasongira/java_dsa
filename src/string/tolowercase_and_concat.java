package string;

import java.util.Locale;

public class tolowercase_and_concat {
    public static void main(String[] args) {
        String s ="My NAme is DHARMENDRA sonGiRa";
        System.out.println(s.toLowerCase());//sab small letter ko capital me convert kar dega
        System.out.println(s.toUpperCase());//sab capital  letter ko small me convert kar dega
////method 2
        s=s.toLowerCase();
        System.out.println(s);

        s=s.toUpperCase();
        System.out.println(s);

        //concate

        String a="abc";
        String b="kndsj";

        System.out.println(a.concat(b));

        //method 2
        a=a.concat(b);
        System.out.println(a);

    }
}
