package Day_30_sep_06.TwoDArray;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        int [][]x=new int[3][3];
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter element for 3 * 3 matrix : ");
        for (int i=0;i<x.length;i++){
            for (int j=0;j<x[0].length;j++){
                x[i][j]=scn.nextInt();
            }
        }
        for (int i=0;i<x.length;i++) {
            for (int j = 0; j < x[0].length; j++) {
                System.out.print(x[i][j]+" ");
            }
            System.out.println();
        }
    }
}
