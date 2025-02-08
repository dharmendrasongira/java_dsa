package String_builder;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class string_builder {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        StringBuilder a=new StringBuilder(sc.nextLine());//input of string builder
        //method 2
        String b= sc.nextLine();
        StringBuilder C= new StringBuilder(b);
        ///capacity
        StringBuilder d= new StringBuilder(10);
        //defalut capacity of string builder 16 if pur empty string in it
        StringBuilder e= new StringBuilder("");
/// you can also use methods of string in string builder \
        System.out.println(a.compareTo(C));
        System.out.println(a.reverse());

    }
}
