package Day_19_Aug_19.InterviewQ;

//can i create incomplete static method in an interface?
//no .. because we can not inherit static method
public interface D {
    //public static void test(); incomplete static method
    // but we can create complete static method in side the interface
    public static void test2(){
        System.out.println(2);
    }
    //also we can create main method because it is also
}
