package Day_15_Aug_11.CONSTRUCTOR.PRIVATE.p1;
//if ypu make constructor private then its object can be created only in same class.
public class A {
    private A(){
        System.out.println("private A");
    }

    public static void main(String[] args) {
        A a=new A();
    }
}
