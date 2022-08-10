package Day_14_Aug_10.DEFAULT.SAMECLASS;
// same class:- we accessed default member in same class
public class A {
    int i=20;
    void test(){
        System.out.println(200);
    }

    public static void main(String[] args) {
        A a1=new A();
        System.out.println(a1.i);
        a1.test();
    }
}
