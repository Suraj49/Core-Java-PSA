package Day_19_Aug_19.JAVA8.DK;

public class B implements A{

    @Override
    public void test1() {
        System.out.println(1);
    }

    public static void main(String[] args) {
        B b1 = new B();
        b1.test1();
        b1.test2();
        b1.test3();
    }
}
