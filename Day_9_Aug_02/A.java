package Day_9_Aug_02;
//Constructor in java
public class A {
    void A(){ //if we write anything before the constructor it becomes method
        System.out.println("Method A");
    }
    A(){ //constructor without argument
        System.out.println("A");
    }
    A(int a){ //constructor with argument that type is int
        //it is also constructor overloading
        System.out.println(a);
    }
    A(int a,int b){
        System.out.println(a);
        System.out.println(b);
    }
    A(int x,float f,char c,short s){
        System.out.println(x);
        System.out.println(f);
        System.out.println(c);
        System.out.println(s);
    }
    public static void main(String[] args) {
        A a5=new A(10,52.64f,'a',(short)656);
        A a1=new A(); //when we create object the constructor is called
        A a2=new A(); //the no of time we create object that many time constructor is called
        A a3=new A(10); //calling constructor have single args
        A a4=new A(30,50);//calling constructor have two args
        a1.A(); //calling method A();
    }
}
