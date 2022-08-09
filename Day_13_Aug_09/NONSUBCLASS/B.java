package Day_13_Aug_09.NONSUBCLASS;

public class B {
    /*
    if we are not inherit the property of any class but creating object of
    another class these classes are known as non sub class
     */
    public static void main(String[] args) {
        A a1=new A(); //we are creating object of diff class .
        System.out.println(a1.x);
        a1.test();

    }
}
