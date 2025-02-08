package string;

public class plus_operator {
    public static void main(String[] args) {
        String a= "abc";
        String b="def";
        a += b;
        System.out.println(a);

        a=10+a;
        System.out.println(a);
        System.out.println("abc"+10+20);//output is abc1020 compiler move left to right ans string + int = string
        System.out.println(10+20+"abc");//output is 30abc compiler move lrft to right start is 10+20 both int so ans int than plus string
    }
}
