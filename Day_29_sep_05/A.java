package Day_29_sep_05;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        int []a = new int[5];
        System.out.println("Enter 5 element: ");
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<a.length;i++){
            a[i]= sc.nextInt();
        }
        for (int x:a){
            System.out.println(x);
        }
    }
}
