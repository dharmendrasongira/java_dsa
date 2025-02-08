package string;

import java.util.Scanner;

public class convert_integer_into_string {
    public static void main(String[] args) {
        System.out.println("enter the number ");
        Scanner sc =new Scanner(System.in);
        int a= sc.nextInt();
       String x= a + "";
        System.out.println(x);


        //method 2 by built in unctiom
        String s= Integer.toString(a) ;
        System.out.println(s);
    }
}
