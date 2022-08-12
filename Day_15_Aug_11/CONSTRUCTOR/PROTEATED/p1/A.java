package Day_15_Aug_11.CONSTRUCTOR.PROTEATED.p1;
// if you make constructor Protected then its object is created in same class ,same package .but not in diff package
public class A {
    protected A(){
        System.out.println("Protected Constructor");
    }

    public static void main(String[] args) {
        A a=new A();
    }
}
