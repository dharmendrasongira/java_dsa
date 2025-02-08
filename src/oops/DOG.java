package oops;

import com.sun.jdi.PathSearchingVirtualMachine;

class dog{
    private String breed;
    private float age;
    private int price;


    public void setBreed( String breed){
        this.breed= breed;
    }
    public void setAge ( float age){
        this.age= age;
    }
    public void setPrice(int price ){
        this.price =price;}
    public String getbreed (){
        return breed;
    }
    public float getage(){
        return age;
    }
    public int getPrice(){
        return price;
    }
}
public class DOG{
    public static void main(String[] args) {
        dog s = new dog();
        s.setAge(5f);
        s.setBreed("kutta");
        s.setPrice(1000);
        System.out.println(s.getbreed());
        System.out.println( s.getage()) ;
        System.out.println(s.getPrice());

    }



}
