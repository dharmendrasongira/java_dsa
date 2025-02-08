package string;

public class indexof_compare_of {
    public static void main(String[] args) {
        String sc =" dharmendra";
        System.out.println(sc.indexOf('m'));
        System.out.println(sc.indexOf('h'));

        System.out.println("comparing");
        String a = "abcd";
        String b= "dbvc";
        System.out.println(a.compareTo(b));//at time of comparissioon asii value of varible in a and b is compared if not same than ascii value of b - ascii value of a is answer
        System.out.println(" if length is not same");
        String c ="adc";
        String d= "adcfdd";
        System.out.println(c.compareTo(d));// if length is not same but some charcter are same minimum length string  so no. of extra character is printed.00
    }
}
