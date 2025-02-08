package array;

import java.util.ArrayList;

public class add_remove_elment_arraylist {
    public static void main(String[] args) {
        ArrayList<Integer>al =new ArrayList<>();
        al.add(12);
        al.add(44);
        al.add(77);
        al.add(88);
        al.add(85);
        al.add(0);
        System.out.println(al);
        al.remove(/*index*/  1);
        System.out.println(al);
    }
}
