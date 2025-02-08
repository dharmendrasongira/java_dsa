package oops.method_overloading;
 class sample{
    public void methodone(String s){
        System.out.println(" string version");
     }
     public void methodone(Object o){
         System.out.println("object version");
     }
 }
public class aumtomatically_wraper_class {
    public static void main(String[] args) {


        sample s = new sample();
        s.methodone("sachine");//string----->string
        s.methodone(new Object());//OBJECT------>OBJECT
        s.methodone(null);//null------> string (refrence) ,object(refrenece)
        ////ye string me chale jayega
    }
}