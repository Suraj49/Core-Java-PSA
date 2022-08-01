package STATIC;

public class A {
    static int x = 10; //static belongs to the class
    public static void main(String[] args){
        System.out.println(A.x);// no need to create object
        A.x = 1000; //value is changed.
        System.out.println(A.x);
    }
}
