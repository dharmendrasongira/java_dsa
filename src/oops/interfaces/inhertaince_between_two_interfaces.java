package oops.interfaces;
interface calculator1{
    // all method atomatically public and abstract

    void add( int a, int b);
    void sub( int a, int b);}
interface advancecalculator1 extends calculator1{
    void mul( int a, int b);
    void div( int a, int b);

}
class vip1 implements advancecalculator1{
    @Override
    public void add(int a, int b) {
        System.out.println("the sum is "+(a+b));}
    public void  sub(int a, int b){
        System.out.println("the sub is "+(a-b));}
    public void mul(int a, int b){
        System.out.println("the mul is "+ (a*b));}
    public void div(int a, int b){
        System.out.println("the divsion is "+(a/b));}
}

public class inhertaince_between_two_interfaces   {
    public static void main(String[] args) {
        advancecalculator1 cal= new vip1();
        cal.add(10,20);
        cal.sub(100,20);
        advancecalculator ad=new vip();
        ad.mul(10,20);
        ad.div(100,20);
    }}
