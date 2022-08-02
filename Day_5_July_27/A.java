package Day_5_July_27;
//data types:-byte,short,int,long,float,double,char,boolean,String,var->java.10
//variable-> 1.static 2.nonstatic 3.local 4.reference
public class A {
    //local variable:- inside method
    public static void main(String[] args) {
        int i=30;//local foe main
        int j; //without initialize can not used
       // System.out.println(j);
        System.out.println(i); //local variable can access directly
        A a1=new A();
        a1.test();
    }
    public void test(){
      //  System.out.println(i); we cannot access local variable inside another method
        int k=65;
        System.out.println(k);
    }
}
