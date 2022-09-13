package StarSapce;

public class A {
    public static void main(String[] args) {
        int count=1;
        for(int i=1;i<=5;i++){
            for (int j=1;j<=5;j++){
                if(j<=count){
                    System.out.print(j+" ");
                    count=i;
                }
            }
            System.out.println();
        }
    }
}
