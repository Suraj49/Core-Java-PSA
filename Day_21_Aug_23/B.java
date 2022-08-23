package Day_21_Aug_23;

public class B {
    public static void main(String[] args) {
        try{
            int i=10;
            int j=0;
            int result=i/j; //exception
            System.out.println(result);
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("hello");
    }
}
