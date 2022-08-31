package METHODS;

public class C {
    public static void main(String[] args) {
        C c1=new C();
        c1.test2();
        c1.test1();
        System.out.println("hello main");
    }

    private void test2() {
        System.out.println("hello test2");
    }

    private void test1() {
        System.out.println("hello test1");
    }
}
