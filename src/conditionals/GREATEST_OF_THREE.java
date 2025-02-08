package conditionals;

import java.util.Scanner;

public class GREATEST_OF_THREE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the 1st no. A:");
        int A = sc.nextInt();
        System.out.println("please enter the 2nd no. B:");
        int B = sc.nextInt();
        System.out.println("please enter the 3rd no.  C:");
        int C = sc.nextInt();

        if (A >=B && A >=C) {
            System.out.println(" A is greater than B and C");
        }
         else if (B >= A && B >= C) {
            System.out.println(" B is greater than A and C");
        }
        else  {
            System.out.println(" C is greater than A and B");
        }
    }
}