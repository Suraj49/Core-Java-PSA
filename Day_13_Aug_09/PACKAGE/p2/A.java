package Day_13_Aug_09.PACKAGE.p2;

import Day_13_Aug_09.PACKAGE.p1.B;

public class A extends B {
    public static void main(String[] args) {
        A a1=new A();
        //A(p1) -> B(p1) -> A(p2)
        System.out.println(a1.i);
    }
}
