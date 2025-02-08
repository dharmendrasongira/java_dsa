package conditionals;

import java.util.Scanner;

public class teranry_opertor {public static void main(String[] args) {
    System.out.println("please enter the number:");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    //teranary operator is genrally replacement operator
    //conditional ?if true : if false
    {
        System.out.println(((n % 2 == 0) ? "even" : "odd"));
    }
}
}
