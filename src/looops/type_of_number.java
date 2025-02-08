package looops;

import java.util.Scanner;

public class type_of_number {public static void main(String[] args) {
    System.out.println("please enter the number:");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x=0;////0 means prime
    for (int i = 2; i <=n-1 ; i++) {

        if (n%i==0){///i is a factor
            System.out.println("composite number");
            x=1;//means composite
            break;
        }
        if(n==1) System.out.println("niether prime or not composite");
        else if(x==1) System.out.println("prime number");

    }}}
