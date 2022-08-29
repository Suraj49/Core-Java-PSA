package Day_25_Aug_29;

import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter any integer value");
        int i=scn.nextInt();
        System.out.println("value : "+i);
        System.out.println("Enter float no");
        float f = scn.nextFloat();
        System.out.println("value: "+f);
        System.out.println("Enter single word ");
        String s=scn.next();
        System.out.println("word is: "+s);
//        System.out.println("Enter description"); when we use the next and next line method in same pro it will not work
//        String s1= scn.nextLine();
//        System.out.println("Description is: "+s1);
    }
}
