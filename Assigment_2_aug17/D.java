package Assigment_2_aug17;

public class D implements A,B,C{
    @Override
    public void test1() {
        System.out.println(1);
    }

    @Override
    public void test2() {
        System.out.println(2);
    }

    @Override
    public void test3() {
        System.out.println(3);
    }

    public static void main(String[] args) {
        D d=new D();
        d.test1();
        d.test2();
        d.test3();
    }
}
