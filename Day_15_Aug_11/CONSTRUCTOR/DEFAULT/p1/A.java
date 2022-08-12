package Day_15_Aug_11.CONSTRUCTOR.DEFAULT.p1;
// if you make constructor default then its object is created in same class ,same package .but not in diff package
public class A {
    A(){
        System.out.println("Default Constructor");
    }

    public static void main(String[] args) {
        A a1=new A();
    }
}
