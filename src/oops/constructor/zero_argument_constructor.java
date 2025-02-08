package oops.constructor;

class employee{
    //instance varible
    String name;
    int age;
    //zero argument constructor
    employee(){
        System.out.println("employe constructor called ");

    }
    public void display(){
        System.out.println("name is"+name);
        System.out.println("age is "+age);}
}
public class zero_argument_constructor {
    public static void main(String[] args) {
         employee emp=new employee();
        emp.display();
    }
}
