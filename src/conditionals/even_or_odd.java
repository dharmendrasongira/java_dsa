package conditionals;

import java.util.Scanner;

public class even_or_odd {
    public static void main(String[] args) {
        System.out.println("pleaase enter numeber :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("Given number is even ");}

         else {
                System.out.println("Givem number is odd");
        }
    }}
