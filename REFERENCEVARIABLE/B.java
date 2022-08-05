package REFERENCEVARIABLE;
//  2.static ref. variable
public class B {
    static B c1;
    public static void main(String[] args) {
        c1 = new B();
        System.out.println(c1);
        c1.test();
    }
    public void test() {
        System.out.println(c1);
    }
}
