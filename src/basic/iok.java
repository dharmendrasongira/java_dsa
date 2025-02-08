package basic;
import java.util.*;
public class iok {
        public static void main(String[] args) {
            Scanner inr = new Scanner(System.in);
            int n = inr.nextInt();
            for (int i = 0; i <= n; i++) {
                for (int j = 1; j<= n-i; j++) {
                    System.out.print("*");
                }
                System.out.println();

            }
            for (int i = 2; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            }}