package oops.method_overiding;
class parent1{
    public Object methodone(){
        return null;
    }
}
class child1 extends parent1{
    public String methodone(){
        System.out.println("hello from child ");
        return null;
    }
}
public class return_type_relation {
    public static void main(String[] args) {
        parent1 p = new child1();
        p.methodone();
    }
}
