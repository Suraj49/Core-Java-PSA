package SUPER;

public class B extends A{
    B(){
       // this(20);
        System.out.println("child class");
    }
    B(int i){
        //super(54);
        this();
        System.out.println(i);
    }
    public static void main(String[] args) {
       // B b1=new B();
       B b2=new B(30);

    }
}
