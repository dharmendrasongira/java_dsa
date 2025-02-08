package conditionals;

import java.util.Scanner;

public class profit_loss { public static void main(String[] args) {
    System.out.println("please enter the cost price:");
    Scanner sc = new Scanner(System.in);
    int cp = sc.nextInt();
    System.out.println("please enter the selling price:");
    int sp = sc.nextInt();
    if (cp<sp){
        System.out.println(" in profit of"+(sp-cp));}
    if(cp>sp){System.out.println("in loss of"+(cp-sp));}
    if (sp ==cp){
        System.out.println(" no profit no loss");
    }
}
}
