package Day_19_Aug_19.JAVA8.FI;

@FunctionalInterface
public interface C {
    public void test1();
    default void test2(){
        System.out.println(2);
    }
    default void test3(){
        System.out.println(3);
    }
}
