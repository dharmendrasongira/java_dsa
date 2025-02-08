package oops.interfaces;
interface demo{
    //interface varible atomatically public static final
    int x=10;
}
public class variable_interface implements demo {
 public static void main(String[] args) {
        int x=10000    ;//local varible
        System.out.println(x);
        System.out.println(demo.x);
        System.out.println(variable_interface.x);
    }
}
