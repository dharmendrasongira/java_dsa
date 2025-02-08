package oops.method_overiding;
//private method participate ni karti inharitnace me
//agar private hai toh vo inherit nahi ki jaa sakti

class parent3{
    private void method(){
        System.out.println("hello from parents");
    }
}
class child3 extends parent3{
    private void method(){
        System.out.println("hello from child ");
    }
}

public class inherit_not_possilefor_private {
    public static void main(String[] args) {
        parent3 p= new child3();
    // error //  p.method();//kyuki private ko inherit nahi kar sakte
    }

}


