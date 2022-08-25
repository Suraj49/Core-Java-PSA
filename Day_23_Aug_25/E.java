package Day_23_Aug_25;

//if condition : -
public class E {
    public static void main(String[] args) {
        for (int i = 0; i < 5 ; i++){
            if(i == 3){
                System.out.println("End");
                break; //if we write break key then its terminate the loop
               // System.out.println("A"); it we write anything after break key it will give code unreachable error
            }
            System.out.println(i);
            System.out.println("Suraj");
        }
    }
}
