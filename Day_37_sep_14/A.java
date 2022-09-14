package Day_37_sep_14;

public class A {
    public static void main(String[] args) {
        try{
            int i=10/2;
            System.out.println(i);
        }catch (Exception e){
            System.out.println(e);
        }finally {
            System.out.println(100);
        }
    }
}
