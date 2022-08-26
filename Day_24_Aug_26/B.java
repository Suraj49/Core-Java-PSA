package Day_24_Aug_26;

//labeled brack :
public class B {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            x:if(i==2){
                break x;
            }
            System.out.println(i);
        }
        x:for(int i=0;i<5;i++){
            if(i==2){
                break x;
            }
            System.out.println(i); //0,1
        }
    }
}
