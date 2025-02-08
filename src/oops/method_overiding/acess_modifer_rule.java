package oops.method_overiding;
//private<default<proctected<public
// public ko uske pecche waale me ni likh sakte ese hi kisis bhi acess modiifier ki range decrease nahi kar sakte

// but aagee bada sakte hai jesse default ko protected public default bana sakte
//private method participate ni karti inharitnace me
//agar private hai toh vo inherit nahi ki jaa sakti

class parent2{
  protected   void method(){
        System.out.println("hello from parents");
    }
}
class child2 extends parent2{
    public void method(){
        System.out.println("hello from child ");
    }
}

public class acess_modifer_rule {
    public static void main(String[] args) {
        parent2 p= new child2();
        p.method();
    }

}
