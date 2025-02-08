package string;

public class interning {
    public static void main(String[] args) {
        String s= "raghav";
        String q= "raghav";
        //raghav--> madhav
        // s.char At(0)='M'; OUTPOUT-->Error
        // s.char At(2)='d'; OUTPOUT-->Error
        // iska matalab ye hai ki hum jese array me indivisual palace pe change kar sakte esa kuch bhi karna string me possible nahi hai
        System.out.println(s);
        // or do string banat same contain ho jisme jese dono me raghav hai q string vo s wali ko hi point kar rahi hai new nahi bani taki memory save ki jaa sake
        //new banana hai toh new key word use karo
        String X= new String("raghav");
        System.out.println(X);

        //bekarr method ==>because need more storage and time
        String o="HELLO";///CONVERT IT INTO HEYLO
        o= o.substring(0,2)+'Y'+ s.substring(3);

        System.out.println(o);
    }
}
