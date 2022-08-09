package Day_13_Aug_09.PACKAGE.p1;

public class B extends A{ //if two class are in same package then we dont require import
    public static void main(String[] args) {
        B b1=new B();//without import, we can access class A
        System.out.println(b1.i);
    }
}
