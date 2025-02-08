package Two_D_array;
import java.util.*;

public class array_list_2d_array {
    public static <list> void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(10);
        a.add(20);
        a.add(30);

        List<Integer> b = new ArrayList<>();
        b.add(40);

        List<Integer> c = new ArrayList<>();

        List<Integer> d = new ArrayList<>();
        d.add(55);
        d.add(75);
        d.add(65);
        d.add(75);

        List<List<Integer>> l = new ArrayList<>();//we can not add no in 2d list because it is list of list
        l.add(a);
        l.add(b);
        l.add(c);
        l.add(d);

/////output
        for (int i = 0; i < l.size(); i++)
            {
                System.out.println(l.get(i) + " ");
            }
        System.out.println();
            // by other method
            for (int j = 0; j < l.size(); j++) {

                List<Integer>x=l.get(j);

                for (int k = 0; k < x.size(); k++)
                {
                    System.out.print(x.get(k) + " ");
                }
                System.out.println();
            }
        }
    }
