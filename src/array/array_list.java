package array;

import java.util.ArrayList;

public class array_list {
    public static void main(String[] args) {
        ArrayList<Integer/*data type*/>arr =new ArrayList<>(/*size*/);//dcletration
        arr.add(0,10);//intialization
        arr.add(1,25);
        arr.add(2,19);//intialization
        arr.add(3,28);
        arr.add(4,16);//intialization
        arr.add(5,11);
        arr.add(55);//intailzation push back
        System.out.println(arr);
//        for(int i=0;i<arr.size();i++){
//            System.out.println(arr.get(i));
//
        arr.set(1,52);//modify
        System.out.println(arr.get(1));

        }
    }

