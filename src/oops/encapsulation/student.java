package oops.encapsulation;
public class student  {
    private int rollno;
    private String name;
    private String address ;
    ///setter method
    public void setRollno(int rollno){
        this.rollno=rollno;

    }
    public void setAddress(String address){
        this.address=address;

    }
    public void setName(String name){
        this.name=name;

    }
//getter method

    public int getRollno() {
        return rollno;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }
}
class launch{
    public static void main(String[] args) {
        student s=new student();
        s.setAddress("mi ");
        s.setName("sachin");
        s.setRollno(43);

        System.out.println( s.getAddress());
        System.out.println( s.getName());
        System.out.println(s.getRollno());
    }
}