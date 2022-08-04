package Day_7_Aug_29;
//ref variable 2.static ref
public class B {
    static B b1=new B(); //static ref. we can access static ref variable anywhere in same class
    public static void main(String[] args) {
        System.out.println(b1); //we can use static ref variable in any method
        b1.test();
    }
    public void test(){
        System.out.println(b1);
    }
}
