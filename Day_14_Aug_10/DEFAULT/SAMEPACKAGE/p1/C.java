package Day_14_Aug_10.DEFAULT.SAMEPACKAGE.p1;
//same package non sub class we can access default member

public class C {
    public static void main(String[] args) {
        A a1=new A();
        System.out.println(a1.i);
        a1.test();
    }
}
