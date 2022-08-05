package Day_7_Aug_29;

public class C {
    int x = 10; //non static var

    static C a4 = new C();// a4 is static ref variable.

    public static void main(String args[]) {
        C a1 = new C();//object is created
        System.out.println(a1.x);//accessing non static variable
        C a2 = new C();
        a2.test();//calling non static method
    }

    public void test() {
        int x = 15;
        System.out.println(x);//accessing loacl variable x=15;
        //but if we want to access non static variable x=10 hare we need 1.static ref. variable or 2.loacal ref variable
        C a3 = new C(); //a3 is loacal ref variable for this method.
        System.out.println(a3.x);//accessing non ststic x=10 using loacl ref variable ;
        //or
        System.out.println(a4.x);//accessing non ststic x=10 using static ref variable;
    }
}