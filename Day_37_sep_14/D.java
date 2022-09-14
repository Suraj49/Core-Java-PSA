package Day_37_sep_14;

import java.sql.Connection;

public class D {
    public static void main(String[] args) {
        try{
            int i=20/0;
            System.out.println(i);
        }catch (ArithmeticException e){
            System.out.println(e);
        }catch (NullPointerException e){
            System.out.println(e);
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
