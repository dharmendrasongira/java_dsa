package oops.method_overloading;
class sample2{
    public void methodone(String s){
        System.out.println(" string version");
    }
    public void methodone(Object o){
        System.out.println("object version");
    }
    public void methodone(StringBuffer o){
        System.out.println("stringBufferversion");
    }
}
public class  wrapper_class_confusion2 {
    public static void main(String[] args) {


        sample2 s = new sample2();
        s.methodone(new String("sachine"));//string----->string
        s.methodone(new Object());//OBJECT------>OBJECT
        s.methodone(new StringBuffer("sachin"));
       // s.methodone(null);//null------> string (refrence) ,object(refrenece),stringbuffer (refrence)
        //// string stringbuffer dono ek level ka hai comfusion ho jayega error dega ambigous error
    }
}
