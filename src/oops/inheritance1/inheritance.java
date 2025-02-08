package oops.inheritance1;

class person{
    public String name;
    public String address;
    public int age;

}
class student1 extends person{
    public int marks;
    public String grade;

    student1(String name,String address,int age, int marks, String grade){
        this.name=name;
        this.address=address;
        this.age=age;
        this.marks=marks;
        this.grade=grade;


    }
    public void display(){
        System.out.println( "name is "+name);
        System.out.println(" address is "+address);
        System.out.println("age is "+ age);
        System.out.println("marks is"+marks);
        System.out.println("grade is"+grade);
    }
}
public class inheritance {
    public static void main(String[] args) {
        student1 stu =new student1("dharmendra ","mujhe nahi pata hai mujhse mt puchona",21,100,"A++++");
        stu.display();
    }
}
