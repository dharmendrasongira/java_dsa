package oops.types_of_variable;
/*
static variable

a. memory will be given in the Method-Area.

b. memory will given at the time of loading.class file

c. Default value will be given if user won't specify any value.

d. Memory will be taken out at the time of unloading the class file.


*/

class loan{
    //static varible
    static float rate_of_interest=9.5f;

}
public class static_varible {
    public static void main(String[] args) {
        System.out.println(loan.rate_of_interest);
    }
}
