package oops.types_of_variable;
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
public class instance_variable {
    public static void main(String[] args) {
        employee emp = new employee();
        emp.display();
    }
}
/*
instance variable

> Memory in heap area =

> Default value depending on datatypes

> Memory initialized at the time of object Creation. =

> Memory will be deactivated at the time of object Destruction
 */
