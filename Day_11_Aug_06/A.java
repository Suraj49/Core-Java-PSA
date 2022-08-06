package Day_11_Aug_06;
//constructor chaining : when you call one constructor from another constructor is called constructor chaining

public class A {
    A(){ //step:3
        this(10); // step: 4 calling line no 9
        System.out.println("A");//step : 8 output A
    } //step: 9 return control to line 14
    A(int i){ //step :5
        System.out.println(i);// step :6 output 10
    } //step :7 return control to line no 6

    public static void main(String[] args) { //step: 1
        A a1=new A(); //step :2 calling line 5
    } //step :10 end
}
