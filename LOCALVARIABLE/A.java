package LOCALVARIABLE;

public class A {
    public static void main (String [] args) {
        int id = 10;
        System.out.println(id);
        A a1 = new A ();
        a1.test ();
    }
    public void test () {
        int x = 10;
        System.out.println(x);
        int y; // not initialized
        //System.out.println(y); // Erro
    }
}
