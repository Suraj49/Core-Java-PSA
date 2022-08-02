package Day_6_July_28;
//variable part 2
public class A {
    //non static variable
    int i=27; //out side all the method but in side class
    int j;//if we dont assigne any value it will automatically get default value
    //default value depands upon data type for int 0;
    public static void main(String[] args) {
        A a=new A();//to access non static member object creation is mendatory
        System.out.println(a.i);
        System.out.println(a.j);
        a.test();
    }
    public void test(){
        System.out.println(i);
    }
}
