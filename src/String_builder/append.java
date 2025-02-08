package String_builder;

public class append {
    public static void main(String[] args) {
        StringBuilder s=new StringBuilder("abc");
        System.out.println(s);
        s.append(5);
        System.out.println(s);

        s.append('g');
        System.out.println(s);

        s.append('*');
        System.out.println(s);

        s.append(2.00554);
        System.out.println(s);

        s.append("jnn");
        System.out.println(s);

        int []ch={'r','a','g'};
        s.append(ch);
        System.out.println(s);

//        int[]arr={1,2,4,5,};//does not work out me address ajayega
//        s.append(arr);
//        System.out.println();


        StringBuilder t=new StringBuilder("ok");
        s.append(t);
        System.out.println(s);

    }
}
