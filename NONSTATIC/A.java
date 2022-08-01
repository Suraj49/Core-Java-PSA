package NONSTATIC;

public class A {
    int i=10;// non static variable

    public static void main(String[] args) {
        A a1=new A();//object is req. to access non-static members
        System.out.println(a1.i);
        a1.i=30; //changing the value of i that is present in a1 object
        //it will not effect the orignal value
        System.out.println(a1.i);
        A a2=new A();
        System.out.println(a2.i);//orignal value is 10
    }
}
