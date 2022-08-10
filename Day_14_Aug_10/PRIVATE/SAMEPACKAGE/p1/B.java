package Day_14_Aug_10.PRIVATE.SAMEPACKAGE.p1;
//same package sub-class: we can not access private member in same package using inheritance
public class B extends A{
    public static void main(String[] args) {
        B b1=new B();
        //System.out.println(b1.x); Error
       // b1.test(); Error
    }
}
