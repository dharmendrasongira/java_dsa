package String_builder;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class valid_anagram {
    public static void main(String[] args) {//anagram matalab ek string ke word ko jumbled karke dusri string banana//length equal hi hogi
        String a="hook";
        String b= "pooh";

        boolean flag =false;
        if (a.length()!=b.length())flag=false;

        else{
        char[]arr=a.toCharArray();
        char[]brr=a.toCharArray();

        Arrays.sort(arr);
        Arrays.sort(brr);



            for (int i = 0; i <a.length() ; i++) {
                if  (arr[i] == brr[i] ) flag = true;
                else flag=false;
            }
            }
        if(flag==true)System.out.println(" is an anagram");
        if(flag== false) System.out.println("not an anagram");

            }
        }


