package Day_7_Aug_29;
// 4. ref. variable -> 1. loacal ref , 2. static ref.
public class A {
    //loacal ref variable
    public static void main(String[] args) {
        A a=new A();//hare a is local ref variable because it is crated inside main
        System.out.println(a);//we can only use static variable inside main otherwise it will give error
        a.test();
    }
    public void test(){
        //System.out.println(a); here error
        A a1=new A();
        System.out.println(a1);//a1 is local variable for test method
    }
}
