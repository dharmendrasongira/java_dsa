package oops.method_overiding;
class parent {
    public void property() {
        System.out.println("land+cash+gold");
    }

    public void marry() {
        System.out.println("relativegirl");

    }
}
    class child extends parent {
        @Override//overiding
        public void marry() {
            //changing implimention
            System.out.println("someother girl.....");
        }
    }

    public class METHOD_OVERIDING {
        public static void main(String[] args) {
            //parent object
            parent p1 = new parent();
            p1.property();
            p1.marry();
            System.out.println();

            //child object
            child c1 = new child();
            c1.property();
            c1.marry();
            System.out.println();

            //
            parent o1 = new child();
            o1.property();
            o1.marry();
        }
    }
