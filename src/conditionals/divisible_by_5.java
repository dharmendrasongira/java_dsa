package conditionals;

import java.util.Scanner;

public class divisible_by_5 {
    public static void main(String[] args) {
        System.out.println("please enter the number:");
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        if( a%5==0){System.out.println(" Given number is divisble by 5");}
        else{System.out.println("Given number is not divisible by 5");}
    }
}
