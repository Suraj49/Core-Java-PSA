package Day_18_Aug_18.INTERFACE;

public class C extends B implements A{ // class to class extends and class to interface implement
    //if one class and one interface needs to inherit then we use extends then use implement
    //if we use implement first and then extends it will gives error
    @Override
    public void test() {
        System.out.println(1);
    }

    public static void main(String[] args) {
        C c=new C();
        c.test();
        c.test1();
    }
}
