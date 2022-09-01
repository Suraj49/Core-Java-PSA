package Day_27_Aug_01;
//remove all duplicate element from array and store into new array
public class A {
    public static void main(String[] args) {
        int []arr={1,2,2,3,4,4,5,6,7,8,8};
        int len=arr.length;
        int temp[]=new int[len];
        int j=0;
        for (int i=0;i<len-1;i++){
            if(arr[i]!=arr[i+1]){
               temp[j]=arr[i];
               j++;
            }
        }
        temp[j]=arr[len-1];
        for (int k=0;k<j+1;k++){
            System.out.println(temp[k]);
        }
    }
}
