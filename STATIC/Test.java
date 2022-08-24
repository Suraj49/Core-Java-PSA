package STATIC;

public class Test {
    public static void main(String[] args) {
        int []a=method();
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]+" ");
        }
    }
    public static int[ ] method(){
        return new int[]{10,20,30};
    }
}
