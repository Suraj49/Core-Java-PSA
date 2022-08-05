package Day_10_Aug_05;
//this part :-2
public class A {
    static int i=20;//static variable
    /*
    we use this keyword to access non static members but we can also access static member using this key
     */
    public static void main(String[] args) {
        A a1=new A();
        a1.test();//a1 object is running
        System.out.println(a1);
        A a2=new A();
        a2.test();//a2 object is running
        System.out.println(a2);
        A.test1();//static method
    }
    public void test(){
        System.out.println(this); //this is points to the current object running in the java

        System.out.println(this.i);//it shows warning message
        this.test1();//also we can call static method
    }
    public static void test1(){
       // System.out.println(this); we can not use this keyword in side static method
        //it will show error
    }
}
