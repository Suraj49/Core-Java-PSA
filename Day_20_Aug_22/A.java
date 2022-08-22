package Day_20_Aug_22;

//Abstract class :- an abstract class is 0 to 100 % complete
//an abstract class consist both static and non-static methods
//an abstract class consist both complete and incomplete methods

public abstract class A {
    //public void test1(); if we make incomplete method like that then it will give error
    //we have to use the abstract key to make incomplete method
    public abstract void test1();
    public void test2(){
        System.out.println(2);
    }
    public static void test3(){
        System.out.println(3);
    }
}
