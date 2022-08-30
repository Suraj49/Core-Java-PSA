package Assigment_4_aug30;
//remove duplicate element form array and put -1 one the index of duplicate element

public class A {
    public static void main(String[] args) {
        int []a=new int[5];
        a[0]=1;
        a[1]=1;
        a[2]=2;
        a[3]=3;
        a[4]=3;
        for (int j=0;j<5;j++){
            System.out.print(a[j]);
        }
        for(int i=0;i<4;i++){
            if(a[i]==a[i+1]){
                a[i]=-1;
            }
        }
        System.out.println();
        for (int j=0;j<5;j++){
            System.out.print(a[j]);
        }
    }
}
