package Day_16_Aug_12.POLYMORPHISM.OVERLOADING;

public class B {
// can we create more the one main method in same class ? let's see

    public static void main(String[] args) {
        System.out.println(100);
        B.main();
    }

    public static void main() {
        System.out.println(200);
    }
}
