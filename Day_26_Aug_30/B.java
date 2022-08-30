package Day_26_Aug_30;
// Array index out of bound: when we access array more than array size then it will give array out of bound

public class B {
    public static void main(String[] args) {
        int []a=new int[4];
        a[0]=1;
        a[1]=10;
        a[2]=20;
        a[3]=40;
        try{
        for (int i=0;i<5;i++) {
            System.out.println(a[i]);
        }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        System.out.println("hello");
    }

}
