package Day_12_Aug_08;
//Default constructor :when we not create any constructor in class the class automatically
//create constructor with blank body and without arguments
public class A {
    /*
    in dot class file
    A(){
    }
    is present
     */
    public static void main(String[] args) {
        A a = new A();
        //at the time of object creation the constructor is called automatically
        //in .(dot)class file the constructor is created.
        //  A a1=new A(50); //compiler only create constructor without agrs that's
        //why it will gives error
    }
}
