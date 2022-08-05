package REFERENCEVARIABLE;
//  1. local ref. variable
public class A {
    public static void main(String[] args){
        A a1 = new A();
        System.out.println(a1);
        a1.test();
    }
    public void test() {
        //System.out.println(a1); //Error because a1 is local
    }
}
