package Day_18_Aug_18.FINAL;

public class B {
    final int i = 10;//final non static variable
   // final int j; if we dont assign any non static variable it will get some default value
    //but in case of final aither it is static and non static its initialization is mandatory
    final static int j=20;

    public static void main(String[] args) {
        B b=new B();
        System.out.println(b.i);
        System.out.println(B.j);
    }
}
