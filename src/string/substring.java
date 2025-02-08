package string;

public class substring {
    public static void main(String[] args) {
        String s = "DHARMENDRA";
        System.out.println(s.substring(2));//index 2or uske baad ke sare charater print ho jayenge

        System.out.println(s.substring(2,6));//print character betwween index i  to j-1 means 2 to 9

        System.out.println(s.substring(2,2));// dono index same ho toh kuch bhi print ni hoga
    }
}