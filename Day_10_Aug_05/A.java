package Day_10_Aug_05;
//this part :-2
public class A {
    public static void main(String[] args) {
        A a1=new A();
        a1.test();//a1 object is running
        System.out.println(a1);
        A a2=new A();
        a2.test();//a2 object is running
        System.out.println(a2);
    }
    public void test(){
        System.out.println(this); //this is points to the current object running in the java
    }
}
