package NEW_KEYWORDS;
/*
-> It sends request to the class so that it can create objects
-> Once object is created new keyword get the object address and stores
in reference variable
 */
public class A {
     static public void main (String[] args) {
        A a1 = new A();
        System.out.println(a1);
        A a2 = new A();
        System.out.println(a2);

    }

}
