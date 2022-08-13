package Day_16_Aug_12.POLYMORPHISM.OVERLOADING;

public class A {
    void test(){//if we make more then one method with same name but diif args and diff types of agrs

        System.out.println("test method");
    }
    void test(int i){
        System.out.println(i);
    }
    void test(int i,int j){
        System.out.println(i+" "+j);
    }

    public static void main(String[] args) {
        A a1=new A();
        a1.test();
        a1.test(10);
        a1.test(20,30);
    }
}
