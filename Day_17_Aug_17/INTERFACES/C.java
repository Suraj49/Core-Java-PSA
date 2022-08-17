package Day_17_Aug_17.INTERFACES;
//interface to class inheritance can be done using implements keyword
public class C implements A{
    //but if we inherit the interface it is necessary to override all the method that is present in interface
    @Override
    public void test() {
        System.out.println("test");
    }

    public static void main(String[] args) {
        C c1=new C();
        c1.test();
    }
}
