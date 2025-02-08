package oops.method_overloading;
class calculator2{
    public void add(int a ,float b){
        System.out.println(" int float argument");
    }
    public void add(float a, int b){
        System.out.println("float_int argument");
    }
}
public class ambigous_method {


public static void main(String[] args) {

        calculator2 c = new calculator2();
        c.add(10,25.5f);//int ,float
       // c.add(10,20);
        //, error compile time error__>ambigous method call
    }}
