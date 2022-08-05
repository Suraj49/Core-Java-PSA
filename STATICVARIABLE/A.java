package STATICVARIABLE;

public class A {
    static int x1 = 10; // static global variable
    public static void main(String[] args) {
        int x2 = 10; // local variable
        System.out.println(x2);
        System.out.println(A.x1);
    }
    public void test() {
        //System.out.println(x2); //Error because local variable
        System.out.println(A.x1); // global variable
    }
}
