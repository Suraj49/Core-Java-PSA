package Day_28_Aug_02;

public class A {
    public static void main(String[] args) {
        int []arr={13,19,27,21,11,22,26,29};
        int len=arr.length;
        for (int i=0;i<len-1;i++){
            for (int j=0;j<len-1;j++){
                if(arr[j]>arr[j+1]){
                    int t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }
        for (int i=0;i<len;i++){
            System.out.println(arr[i]);
        }
    }
}
