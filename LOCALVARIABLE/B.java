package LOCALVARIABLE;

public class B {
    public static void main(String[] args) {
        int i=10;
        System.out.println(i);
        B b1=new B();
        b1.test1(10);
    }
    public void test1(int i){
        System.out.println(i);
    }
}
