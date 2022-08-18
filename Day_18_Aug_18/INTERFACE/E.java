package Day_18_Aug_18.INTERFACE;

public class E implements D{
    @Override
    public int test1() {
        return 100;
    }

    @Override
    public void test2(int x) {
        System.out.println(x);
    }

    public static void main(String[] args) {
        E e = new E();
        int val=e.test1();
        System.out.println(val);
        e.test2(200);
    }
}
