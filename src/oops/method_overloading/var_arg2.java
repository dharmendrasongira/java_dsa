package oops.method_overloading;
class demo {
    //exact match :one argument
    public void method2(int i){
        System.out.println("genral method ");
    }
    //var_args :0ton
    public void method2(int... args){
        System.out.println("var - args method ");
    }
}

public class var_arg2 {
    public static void main(String[] args) {
        demo d= new demo();
        d.method2(10,20);//var args
        d.method2(5,55,5,5);//var args
        d.method2(12);//exact match :one argument
    }
}
