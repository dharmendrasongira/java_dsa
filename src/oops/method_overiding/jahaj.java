package oops.method_overiding;
class plane{
    public void takeoff(){
        System.out.println("plane takee off..");
    }
    public void fly(){
        System.out.println("plane is flying");
    }
    public void land(){
        System.out.println("plan is landing...");
    }
}
class passengerplane extends plane{
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
class cargoplane extends plane{
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
class  fighterplane extends plane{
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
fighterplane f= new fighterplane();

        airport a = new airport();
        a.allowplane(p);
        a.allowplane(c);
        a.allowplane(f);

    }
}
