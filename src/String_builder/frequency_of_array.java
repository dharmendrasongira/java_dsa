package String_builder;

import java.awt.*;
import java.util.Scanner;

public class frequency_of_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int index = (int) ch - 97;
            freq[index]++;
        }
        int max =-1;
        for (int i = 0; i < freq.length; i++) {
            max= Math.max(max,freq[i]);
            }
            for (int j = 0; j < freq.length; j++) {
                if (freq[j]==max){
                    char ch = (char)(j+97);
                    System.out.print(ch+" ");
                }
            }
        }
    }

