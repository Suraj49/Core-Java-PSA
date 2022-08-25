package Day_22_Aug_24;

//Null Pointer Ex:- when access non-static member using null reference variable
/// it will give null pointer Exception
public class B {
    int i=20;
    static B b;//by default reference variable is null
    public static void main(String[] args) {
        try {
            System.out.println(b.i);
        }catch (NullPointerException e){
            System.out.println(e);
        }
        System.out.println(100);
    }
}
