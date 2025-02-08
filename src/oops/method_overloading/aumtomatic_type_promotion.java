package oops.method_overloading;
class calculator1{
public void add(int a){
    System.out.println(" int argument");
}
public void add(float a){
    System.out.println("float argument");
}
}
public class aumtomatic_type_promotion {
    public static void main(String[] args) {

        calculator1 c = new calculator1();
        c.add('a');//char ----> char,int
        c.add(19l);//long---->float ,double
        //c.add(10.5)//double--> double, error compile time error
    }
}
/*
Overloading

Compiler binding the call based on argument

a. if exact match is found bind the call

b. if exact match not found, perform implicit typecasting till it reaches to bind
implicit type casting still if the call

c. upon implicit typecasting still if the call can't be bind, it would result in "compilation Eror"
 */
