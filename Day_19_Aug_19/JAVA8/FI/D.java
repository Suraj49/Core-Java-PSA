package Day_19_Aug_19.JAVA8.FI;

public class D implements C{
    @Override
    public void test1() {
        System.out.println(1);
    }

    public static void main(String[] args) {
        D d1 = new D();
        d1.test1();
        d1.test2();
        d1.test3();
    }
}
