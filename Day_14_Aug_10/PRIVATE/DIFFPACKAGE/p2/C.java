package Day_14_Aug_10.PRIVATE.DIFFPACKAGE.p2;

import Day_14_Aug_10.PRIVATE.DIFFPACKAGE.p1.A;

//different package non sub class we cannot access private member
public class C {
    public static void main(String[] args) {
        A a1=new A();
//        System.out.println(a1.x); error
//        a1.test(); error
    }
}
