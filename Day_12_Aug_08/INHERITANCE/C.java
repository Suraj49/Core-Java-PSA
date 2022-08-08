package Day_12_Aug_08.INHERITANCE;

public class C extends B{
    public void test3(){
        System.out.println("C");
    }
    public static void main(String[] args) {
        C c1=new C();
        c1.test1();
        c1.test2();
        c1.test3();
        System.out.println(c1.x);//using parent class variable in child class
    }
}
