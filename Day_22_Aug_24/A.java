package Day_22_Aug_24;

// 1. Arithmetic Ex:- it helps us to handle arithmetic related exception like dividing by zero

public class A {
    public static void main(String[] args) {
        try {
            int i=10;
            int j=0;
            int k=i/j;
            System.out.println(k);
        }catch (ArithmeticException e){
            System.out.println(e);
        }
        System.out.println(100);

    }
}
