package oops.constructor;
class person2{
    public String name;
    public String adress;
    public int age;

}
class student extends person2 {
    public int marks;
    public String grade;
    /*
    What is a constructor?

Ans. Constructor is a method, which has got the same name as that of the classname.

while writing a constructor, we should not keep return type for the method. Constructor gets called automatically at the time of object Creation. since constructor gets called automatically at the time of object creation, we use this cons the instance variables of the class.






How many types of constructors we can have in java class?

a. Zero argument constructor.

b. Parameterized constructor.
    */

    student( String name, String address,int age,int marks,String grade){
        this.name=name;
        this.grade=grade;
        this.age=age;
        this.marks=marks;
        this.adress=address;
    }
    public void display(){
        System.out.println("name  is "+ name);
        System.out.println("address is "+ adress);
        System.out.println("age is "+age);
        System.out.println("marks is "+ marks);
        System.out.println("grade is "+grade);
    }
}

public class constructor_with_argument {
    public static void main(String[] args) {
        student s = new student("sachin","dewas",51,550,"a");
        s.display();
    }
}

