package Day_14_Aug_10.PRIVATE.SAMECLASS;
// private can be accessed only in same class
public class A {
    private int i=10; //private variable
    private void test(){ //private method
        System.out.println(100);
    }

    public static void main(String[] args) {
        A a1=new A();
        System.out.println(a1.i);
        a1.test();
    }
}
