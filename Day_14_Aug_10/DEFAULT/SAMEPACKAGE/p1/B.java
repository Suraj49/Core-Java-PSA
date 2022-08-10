package Day_14_Aug_10.DEFAULT.SAMEPACKAGE.p1;
//same package sub class using inheritance we can access default members
public class B extends A {
    public static void main(String[] args) {
        B b1=new B();
        System.out.println(b1.i);
        b1.test();
    }
}
