package oops.method_overloading;
class calculator{
    public void add(int a, int b ){
        System.out.println("int_int argument");
    }
    public void add(float a, float b ){
        System.out.println("float_float argument");
    }
    public void add(double a, double b ){
        System.out.println("double double argument");
    }
}
public class method_overloading {
    public static void main(String[] args) {
        calculator c=new calculator();
        c.add(5,6);//int,int
        c.add(5.0f,5.0f);//float float
        c.add(10.0,20.0);//double double
    }
}
/*
Methodoverloading

Two methods is said to be overloaded, iff both the methods have same name but different argument types: In case of methodoverloading,
 Compiler will bind the call of the method to the body of the method.
JVM should just execute the method body, so we say Methodoverloading as "CompileTimeBinding/EarlyBinding".

eg#1.
 */