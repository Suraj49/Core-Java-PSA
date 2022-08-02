package Day_8_Aug_01;

public class A {
    public static void main(String[] args) {
        A a=new A();
        int x=a.test();
        System.out.println(x);
        a.test2(10,20,30,40,50);//we can pass any no of args of same type;
        a.test2(102,105,123,188,192,452,514);
        a.test3(1.2,2.3,3.3);
    }
    public char test(){
        return 100;
    }
    public void test2(int...i){ //int...i is Array and we can access it using loops;
        for (int n=0;n<i.length;n++){
            System.out.println(i[n]);
        }
    }
    public void test3(double...f){ //and also we can access like that
        System.out.println(f[0]);
        System.out.println(f[1]);
        System.out.println(f[2]);
    }
}
