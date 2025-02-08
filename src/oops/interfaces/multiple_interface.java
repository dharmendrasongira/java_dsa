package oops.interfaces;
interface iocalculator{
    // all method atomatically public and abstract

    void add( int a, int b);
    void sub( int a, int b);}
interface advancecalculator{
    void mul( int a, int b);
    void div( int a, int b);

}
class vip implements iocalculator,advancecalculator{
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

public class multiple_interface  {
    public static void main(String[] args) {
        vip cal= new vip();
        cal.add(10,20);
        cal.sub(100,20);
        advancecalculator ad=new vip();
        ad.mul(10,20);
        ad.div(100,20);
    }}

