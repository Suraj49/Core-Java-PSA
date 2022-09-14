package Day_37_sep_14;

public class B {
    public static void main(String[] args) {
        try{
            int i=10/0;
            System.out.println(i);
        }finally {
            System.out.println(100);
        }
    }
}
