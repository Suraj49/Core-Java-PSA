package Day_23_Aug_25;

//3. Number format Exception :- when an invalid sting to int conversion is done then we will get no format ex.

public class B  {
    public static void main(String[] args) {
       try {
           String s = "hello";
           int k = Integer.parseInt(s);
           System.out.println(k);
       }catch (NumberFormatException e){
           System.out.println(e);
       }
        System.out.println(100);

    }
}
