package Day_14_Aug_10.PRIVATE.DIFFPACKAGE.p2;

import Day_14_Aug_10.PRIVATE.DIFFPACKAGE.p1.A;

// different package sub class using inheritance we cannot access
public class B extends A {
    public static void main(String[] args) {
        B b1=new B();
       //  System.out.println(b1.x); Error
       // b1.test(); Error
    }

}
