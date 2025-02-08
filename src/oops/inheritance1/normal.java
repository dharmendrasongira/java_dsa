package oops.inheritance1;
class person1{
    public String name;
    public String adress;
    public int age;

}
class student extends person1{
    public int marks;
    public String grade;
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

public class normal {
    public static void main(String[] args) {
        student s = new student("sachin","dewas",51,550,"a");
        s.display();
    }
}
