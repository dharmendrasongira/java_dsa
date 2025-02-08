package oops.encapsulation;

public class book {
    private int page_number;////data hiding
    public void set_data (int x){
       if (x>0){
           page_number=x;
       }else {
           System.out.println("invalid data");
       }
    }
    public int get_data(){
        if(page_number>0){
            return page_number;
        }
        else System.out.println("empty book");
       return 0;
    }
    class test {
        public static void main(String[] args) {
             book b =new book();
             b.page_number=100;
            System.out.println(b.page_number);
        }
    }
}
