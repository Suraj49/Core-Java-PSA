package StringAssgnment.interviewQ;

final public class E {//
    public static void main(String[] args) {
        String s1=new String("suraj");
        String s2=new String("suraj");
        System.out.println(s1==s2);// false because it is comparing the address of s1 and s2;
        System.out.println(s1.equals(s2)); // true because inside s1 and s2 have same string


    }
}
