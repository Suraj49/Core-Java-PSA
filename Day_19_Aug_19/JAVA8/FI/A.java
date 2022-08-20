package Day_19_Aug_19.JAVA8.FI;
//FunctionalInterface can have only one incomplete method in it.

@FunctionalInterface
public interface A {
    public void test1();
   // public void test2(); error if we create more than one incomplete method then it will show error

}
