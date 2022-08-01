package METHODS;

public class A {
    public static void main(String[] args) {
        A.test1();//accessing static method using class name
        test1();//we can also access like that
        A a1=new A();
        a1.test2();//accessing non static method using object
    }
    public static void test1(){
        System.out.println("static method");
    }
    public void test2(){
        System.out.println("non static method");
    }
}
