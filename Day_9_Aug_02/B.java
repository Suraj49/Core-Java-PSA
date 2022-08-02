package Day_9_Aug_02;
//this keyword
public class B {
    int i=151; //non static variable
    public static void main(String[] args) {
        B b1=new B(); //b1 is ref variable and it is store the add. of object
        System.out.println(b1);//printing the object address
        //accessing non static member using ref variable b1
        System.out.println(b1.i);
        b1.test();//calling non static member using object
    }
    public void test(){
        System.out.println(this);//this is also ref variable that store add. of object
        //b1 and this both have same address
        //also using this keyword we can access non satic members
        System.out.println(this.i);
        this.test2();//calling non static method using this key
    }
    public void test2(){
        System.out.println("called using this key");

    }
}
