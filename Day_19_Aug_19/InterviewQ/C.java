package Day_19_Aug_19.InterviewQ;

@FunctionalInterface
public interface C extends A,B{  //Error
    //inherited method is test1(),test2();
    //but we know that functional interface have only one incomplete method.
    public void test3();
}
