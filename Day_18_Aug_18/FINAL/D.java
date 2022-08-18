package Day_18_Aug_18.FINAL;

public class D extends C{
    @Override
    public void test1(){
        System.out.println(3);
    }
//    @Override
//    public void test(){
//
//    }
    // when you make method as final you cannot override that method

    public static void main(String[] args) {
    D d1=new D();
    d1.test();
    d1.test1();

    }
}
