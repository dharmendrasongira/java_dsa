package looops;
import java.util.Scanner;
public class printing_AP {public static void main(String[] args) {
    System.out.println("please enter the number:");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a=1,d=5;
    for (int i =1; i<=n; i++) {
        System.out.println(a);
       a+=d;
    }}}
