package Day_26_Aug_30;

public class A {
    public static void main(String[] args) {
        int[] x = new int[3];
        System.out.println(x);
        System.out.println(x.length); //length is
     //   non-static variable
        x[0] = 10;
        x[1] = 20;
        x[2] = 30;
        System.out.println(x[0]);
        System.out.println(x[1]);
        System.out.println(x[2]);
    }
}
