package Day_23_Aug_25;

//Array index out of Bound ex:- when we try to access array more than its size then it will give exception

public class F {
    public static void main(String[] args) {
        int []a=new int[2];
        try {
            a[0]=10;
            a[1]=20;
            a[2]=30;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        for (int i=0;i<2;i++){
            System.out.println(a[i]);
        }
    }

}
