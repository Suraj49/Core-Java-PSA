package STATIC_AND_NONSTATIC;

public class A {
    int x = 10; // non static
    static int y = 100; //static
    public static void main(String[] args){
        A b1 = new A();
        System.out.println(b1.x); // non static calling through object.
        System.out.println(A.y); //static member calling through class name
    }
}
