package oops.types_of_variable;
class calculator{
    public void add( int a, int b )
    {
        int result =a+b;
        System.out.println("the sum is ::"+result);

    }
}
public class localvariable {
    public static void main(String[] args) {
        calculator c=new calculator();
        c.add(10,20);
    }
}
/*
Local variables

=>variables declared inside the method

=>Memory will be given inside stack area

=>Once the control enters inside the method memory will be given.

=>Once the control leaves the method memory will be taken out.

=>No default value will be given to the local variables
 */