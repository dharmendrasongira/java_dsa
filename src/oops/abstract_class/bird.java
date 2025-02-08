package oops.abstract_class;

public abstract class bird {
    public abstract void fly();
    public abstract void eat();

}
class sparrow extends bird {
    @Override
    public void fly(){
        System.out.println("sparrow fly short height ");
    }
    public void eat() {
        System.out.println("sparrow eat grain");

    }
}

class carrow extends bird {
    @Override
    public void fly(){
        System.out.println("crroow fly medium height ");
    }
    public void eat() {
        System.out.println("carrow eat grain");

    }}

abstract class eagle extends bird {
    @Override
    public void fly() {
        System.out.println("engle very very high height ");
    }

    public abstract void eat();// on basis of eating eagle classified in two types
}
class sperenteagle extends eagle {
    @Override


    public void eat(){
        System.out.println("sperent eagle eats sankes");
    };// on basis of eating eagle classified in two types
}
 class goldeneagle extends eagle {
    @Override


    public void eat(){
        System.out.println("golden eagle eats catches prey over the ocean");
    };// on basis of eating eagle classified in two types
}
class sky{
    public void allow_birds(bird ref){
        ref.eat();
        ref.fly();
        System.out.println();
    }
}
 class test {
    public static void main(String[] args) {
        sky s= new sky();
        s.allow_birds( new carrow());
        s.allow_birds(new sparrow());
        s.allow_birds(new sperenteagle());
        s.allow_birds(new goldeneagle());

    }
}