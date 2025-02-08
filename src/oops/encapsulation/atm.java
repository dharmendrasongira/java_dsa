package oops.encapsulation;

public class atm {
    //data security
    private double balance;
    //method public
    public double getBalance(double balance ){
        //withdrawing the money
return 0.0f;
    }
    public void setbalace(double balance) {
        ////perform authentication
     boolean result =  validate ("sachin", "sachin123");

     if (result== true ) {//deposite money
        this.balance= this.balance +balance;
         System.out.println("credited to account");
 }
     else {//throw meaning full messages
         System.out.println("invalid user name and password" );
 }
    }
    //method =>privatee
    private boolean validate(String username, String password){
        //logic for authentication
        return username.equalsIgnoreCase("sachin")&&password.equals("tendulkar");
    }
   public class testapp{
        public  static void main(String[] args) {
            atm acc= new atm();

  acc.setbalace(1000.0);      }
    }


}
