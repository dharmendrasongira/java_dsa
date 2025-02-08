package oops.method_overloading;

class Animal{
}
class monkey extends Animal{

}
class  app{
    public void op( monkey m){
        System.out.println("monkey version..........");
    }
    public void op(Animal a){
        System.out.println("animal version.......");
    }
}
public class inhertance_priority {
    public static void main(String[] args) {
        app p= new app();///app object


        monkey m=new monkey();//monkey object
        p.op(m);


        Animal a= new Animal();//  animal object
        p.op(a);

//parent obj = new child();
        Animal an = new monkey();///reference animal ka hai toh animal wala call hoga
        p.op(an);

    }
}
