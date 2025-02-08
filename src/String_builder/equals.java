package String_builder;

public class equals {
    public static void main(String[] args) {
        String x="abc";
        String y=new String(x);
        System.out.println(x.equals(y));

        // why we donot use == beacuse it only compare addreess

        System.out.println(x==y);//it gives false because new string is create
        String z="abc";
        System.out.println(x==z);//because ese banayenge toh ek string jo hai uska naam x bhi or z ho jayega contain same hai toh yahi interning hota hai
    }
}
