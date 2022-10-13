package StringAssgnment.interviewQ;

final public class G {
    public static void main(String[] args) {
        String s1="xyz";
        String s2=new String("xyz");
        String s3="xyz";
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1.equals(s2));
    }
}
