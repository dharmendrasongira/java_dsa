package oops.method_overiding;
//final is an access modifer applicable at

// variable => If applied at variable level, then the value can't be changed.
// b. method => If applied at method level, then we can't override the method.
// class => If applied at class level, then the class won't particate in inheritance.
class parent4{
    private void method(){
        System.out.println("hello from parents");
    }
}
class child4 extends parent4{
    private void method(){
        System.out.println("hello from child ");
    }
}

public class final_acesmodifier  {
    public static void main(String[] args) {
        parent4 p= new child4();
        //erorr  p.method();//kyuki private ko inherit nahi kar sakte
    }

}

