package Day_20_Aug_22;

public class B extends A{
    @Override
    public void test1() {
        System.out.println(1);
    }

    public static void main(String[] args) {
        B b=new B();
        b.test1();
        b.test2();
        B.test3();
    }
}
