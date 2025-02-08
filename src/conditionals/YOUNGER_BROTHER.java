package conditionals;

import java.util.Scanner;

public class YOUNGER_BROTHER {public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("please enter the 1st no. A:");
    int ram = sc.nextInt();
    System.out.println("please enter the 2nd no. B:");
    int shayam = sc.nextInt();
    System.out.println("please enter the 3rd no.  C:");
    int ajay= sc.nextInt();

    if (ram<shayam) {if(ram<ajay) {
        System.out.println(" RAM is younger than shayam and ajay");
    } else System.out.println("ajay is younger than ram and ajay ");
    }
    if (shayam>ram ) {if(shayam>ajay) {
        System.out.println(" shayam is younger than Ajay and ram");
    } else System.out.println("ajay is younger than ram and ajay ");
    }
}}
