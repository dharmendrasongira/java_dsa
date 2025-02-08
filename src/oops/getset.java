package oops;

class student {
    //data security
    private int roll_no;
    private String name;
    private String address;

    //setter methods
    public void setRoll_no(int roll_no){
        this.roll_no=roll_no;

    }
    public void setname(String name){
        this.name =name;

    }
    public void setAddress(String address){
        this.address=address;

    }

    public int getRoll_no() {
        return roll_no;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}
public class getset {
    public static void main(String[] args) {
       student sc= new student();

       sc.setname("dharmendra");
       sc.setAddress("kyu batau");
       sc.setRoll_no(43);


        System.out.println("address"+sc.getAddress());
        System.out.println("name is "+ sc.getName());
       System.out.println("roll number is "+sc.getRoll_no());

    }
}
