package conditionals;

import java.util.Scanner;

public class calculator_switchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char op = sc.next().charAt(0);
        int b = sc.nextInt();


//        if (op == '+') System.out.println(a + b);
//        else if (op == '-') System.out.println(a - b);
//        else if (op == '*') System.out.println(a * b);
//        else if (op == '/') System.out.println(a / b);
//        else if (op == '%') System.out.println(a % b);
//        else System.out.println(" inavalid opertor");

        switch(op){
            case '+' :
                System.out.println(a+b);
                break;
            case '-' :
                System.out.println(a-b);
                break;
            case '/' :
                System.out.println(a/b);
                break;
            case '*' :
                System.out.println(a*b);
                break;
            case '%' :
                System.out.println(a%b);
                break;
            default:
                System.out.println("inavalid output");
        }
    }
}