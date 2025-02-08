package oops.abstract_class;

/*

In real word, for few cases object should not be created, to handle such scenarios in java we need go for a keyword called "abstract".

abstract access modifer can be applied at

a. class level -> yes possible, if we make class as abstract then object can't be instantiated.
b. method level -> yes possible, if we make method as abstract, then we can't give body for the methods.
c. variable level -> no we can't use abstract at variable level.

 */
abstract class plane{
    public abstract void takeoff();
  public abstract void fly();
    public abstract void land();
}
class passengerplane extends plane {
    public void takeoff(){
        System.out.println("passenger plane takee off..");
    }
    public void fly(){
        System.out.println("passenger is flying");
    }
    public void land(){
        System.out.println("passenger plan is landing...");
    }
}
class cargoplane extends plane {
    public void takeoff(){
        System.out.println("cargo plane takee off..");
    }
    public void fly(){
        System.out.println("cargo plane is flying");
    }
    public void land(){
        System.out.println("cargo plan is landing...");
    }
}
class  fighterplane extends plane {
    public void takeoff(){
        System.out.println("fighter plane takee off..");
    }
    public void fly(){
        System.out.println("fighter plane is flying");
    }
    public void land(){
        System.out.println("fighter plan is landing...");
    }

}
class airport{
    public void allowplane(plane p){
        p.takeoff();
        p.fly();
        p.land();
        System.out.println();
    }
}


public class jahaj{//true polymorphism
    public static void main(String[] args) {
    passengerplane p= new passengerplane();
    cargoplane c=new cargoplane();
    fighterplane f=new fighterplane();

        airport a = new airport();
        a.allowplane(p);
        a.allowplane(c);
        a.allowplane(f);
      //  plane o = new plane (); abstract class ke obejct nahi banasakte

    }
}


