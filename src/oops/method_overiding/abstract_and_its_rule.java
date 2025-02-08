package oops.method_overiding;
/*abstract is an access modifer applicable at



}

a. method -> If we are not giving the body for a method then mark the method as "abstract". b. class -> If we don't want the object to be created for a class then the bass as "abstract".

c. variable-> This access modifier can't be applied on variables.

In case of overriding, compulsorily the child class should give implementation for all the abstract methods present in the parent class, if the implementation is not given then that child class should be marked as "abstract".

eg#1.*/

abstract class Parent5 {


    public abstract void methodone();
}
class child5 extends Parent5 {

    public void methodone() {


        System.out.println("ChildClass:: methodone ()");

    }
}
public class abstract_and_its_rule {

    public static void main(String[] args) {
        Parent5 p = new child5();

        p.methodone();

    }

}
