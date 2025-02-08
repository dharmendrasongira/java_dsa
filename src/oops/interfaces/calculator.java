package oops.interfaces;
interface icalculator{
    // all method atomatically public and abstract

    void add( int a, int b);
    void sub( int a, int b);
    void mul( int a, int b);
    void div( int a, int b);

}
class imp implements icalculator{
    @Override
    public void add(int a, int b) {
        System.out.println("the sum is "+(a+b));}
    public void  sub(int a, int b){
        System.out.println("the sub is "+(a-b));}
    public void mul(int a, int b){
        System.out.println("the mul is"+ (a*b));}
    public void div(int a, int b){
        System.out.println("the divsion is"+(a/b));}
    }

public class calculator {
    public static void main(String[] args) {
   imp cal= new imp();
    cal.add(10,20);
    cal.sub(100,20);
    cal.mul(10,20);
cal.div(100,20);
    }}
