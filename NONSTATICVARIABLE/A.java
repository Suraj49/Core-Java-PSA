package NONSTATICVARIABLE;

public class A {
    int id; // id name
    public static void main(String[] args) {
        int id = 10; // id name
        A a1 = new A();
        System.out.println(a1.id);
        System.out.println(id);
    }
}
