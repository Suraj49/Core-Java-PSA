package Day_20_Aug_22;

public class E extends D{
    @Override
    public void test1() {
        System.out.println(1);
    }

    @Override
    public void test2() {
        System.out.println(2);
    }

    public static void main(String[] args) {
        E e=new E();
        e.test1();
        e.test2();
    }
}
