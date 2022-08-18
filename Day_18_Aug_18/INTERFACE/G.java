package Day_18_Aug_18.INTERFACE;

public class G implements F{
    public static void main(String[] args) {
        System.out.println(G.id);
        System.out.println(G.id2);//accessing static variable
        //F f=new F(); we can not create object of interface
        //but we can create ref variable of interface
        F f=null;
    }
}
