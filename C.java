public class C {
    C(){ // constructor should have same names as that class name
        System.out.println("C");
      //  C c4=new C(); this is not possible ; error
        C c4=new C(60); //this is possible;
    }
    // if you are using more then one constructor in same class . then you need to diff with args.

    C(int i){ // constructor can also receives the value
        System.out.println(i);
    }
    C(String f,int k){
        System.out.println(f); // printing string
        System.out.println(k); // printing int k
    }

    // Can we create a method with same name as class?
    public void C(){ //this is method not constructor becoz we konw that constructor have no return type
        // bu method have return type
        //by default contructor have void return type but we can't write contructor like void C(){..}
        System.out.println("Hello method");
        return ;
    }

    public static void main(String[] args) {
        C c1=new C(); //Object is created then constructor is called.
        new C();   // the no of time i create the object these many time the constructor is called.
        new C(80);//passing the value through object ;
        C c2=new C("Suraj",85);
        System.out.println("main method");
        c1.C();//Calling C() method
    }
}