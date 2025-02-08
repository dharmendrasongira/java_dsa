package oops.method_overiding;

public class animal {
    public void eat(){
        System.out.println("animal is eating");
    }
    public void sleep(){
        System.out.println("animal is sleeping");
    }}
   class monkey extends animal{
        @Override
        public void eat() {
            System.out.println("monkey is eating");
        }
        public void sleep(){
            System.out.println("monkey is sleepig");
        }
    }
    class deer extends animal{
        @Override
        public void eat() {
            System.out.println("deer is eating");
        }
        public void sleep(){
            System.out.println("deer is sleepig");
        }
    }
    class lion extends animal{
        @Override
        public void eat() {
            System.out.println("lion is eating");
        }
        public void sleep(){
            System.out.println("lion is sleepig");
        }
    }


class forest {
   public void allow_animal( animal ANIMAL){
       ANIMAL.eat();
       ANIMAL.sleep();
       System.out.println();
    }

}
class launch {
    public static void main(String[] args) {
        forest f= new forest();

        f.allow_animal(new monkey());
        f.allow_animal(new lion());
        f.allow_animal(new deer());

    }
}
