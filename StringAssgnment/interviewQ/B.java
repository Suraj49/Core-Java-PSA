package StringAssgnment.interviewQ;

public class B {
    //count no of word in given string
    public static void main(String[] args) {
        String str="SURAJ KUMAR BIHAR";
        String[] s=str.trim().split(" ");
        System.out.println(s.length);
        for (String x:s){
            System.out.println(x);
        }
    }
}
