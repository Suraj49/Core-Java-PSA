package Day_5_July_27;
//variable-> 1.static 2.nonstatic 3.local 4.reference
public class B {
    // static variable: static keyword is used
    static int i=55; //out side all the method but in side class
    static int j; //if we not intialize staic variable it will get default value
    //default value depands upon data type for int it is 0;
    public static void main(String[] args) {
        System.out.println(B.i); //accessing static variable using class name
        System.out.println(B.j); //it will gives defalut value of j;
        //also we can access static variable directly
        System.out.println(i);
        j = 20; //compiler change it into B.j=20
        B b=new B();
        b.test();
    }
    public void test(){
        System.out.println(B.i); //static variables can also access out side main
        //we can access static anywhere in the program
        System.out.println(i);
    }

}
