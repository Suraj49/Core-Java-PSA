package Day_10_Aug_05;
//calling constructor using this();
public class B {
    B(){
        this(10); // we can call constructor using this();
        //while calling constructor using this() ensure that this calling being done form
        //another constructor .
        //while calling const. using this() make sure that this shuld be the very first statement in onther const.
    }
    B(int i){
        System.out.println(i);
    }
    public static void main(String[] args) {
        B b1=new B();//object is created constructor is called
    }
}
