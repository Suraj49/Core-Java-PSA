package Day_14_Aug_10.PROTACTED.SAMECLASS;

public class A {
    protected int i=20;
    protected void test(){
        System.out.println(200);
    }

    public static void main(String[] args) {
        A a1=new A();
        System.out.println(a1.i);
        a1.test();
    }
}

