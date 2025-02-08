package oops.abstract_class;
abstract class person {
    String name;
    int age;
    float height;
    person(String name, int age, float height){
        this.name=name;
        this.age=age;
        this.height=height;
    }
        }
        class student extends person{
    int marks;
    float avg;
     student(String name,int age ,float height,int marks,float avg ){
         //to call paramterizied constructor o parent class from child super is used
         super(name,age,height);
        this.marks=marks;
        this.avg=avg;

        }
        public void display(){
            System.out.println( "name is"+name);
            System.out.println("age is"+age);
            System.out.println("height is"+height);
            System.out.println("marks is"+marks);
            System.out.println("avg is"+ avg);
        }
}
public class constructor_abstract_class {
    student stu= new student("sachin",51,5,350,100f);
}
