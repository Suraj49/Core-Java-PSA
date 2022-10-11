package StringAssgnment.interviewQ;

import java.util.Scanner;

public class C {
    //Match the opening and closing bracket.
    public static void main(String[] args) {
        matchOpeningClosing();
    }

    private static void matchOpeningClosing() {
        Scanner scn=new Scanner(System.in);
        System.out.println("Plese Inter Opening and Closing ( ) Parenthesis : ");
        String str=scn.next();
        int count1=0;
        int count2=0;
        for (int i=0;i<str.length();i++){
            if(str.charAt(i)=='('){
                count1++;
            }
            else if (str.charAt(i)==')'){
                count2++;
            }
        }
        if (count1==count2){
            System.out.println("Matched ! No Error ");
        }else {
            System.out.println("Not Matched ! Error ");
        }
    }
}
