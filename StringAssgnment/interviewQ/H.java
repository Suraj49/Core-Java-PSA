package StringAssgnment.interviewQ;

public class H {
    public static void main(String[] args) {
        String s1="xyz"; // new Object is created with contain xyz;
        String s2="xyz";//  hare the value inside s1 is also same as s2
        // so hare s2 is also start pointing to the object s1;
        //so the address of s1 and s2 is same;
        String s3=new String("xyz");
        //hare new object is created why beacuse hare we creating object using new keyword;
        String s4=new String("xyz");
        //hare new object is created why beacuse hare we creating object using new keyword;
        //lets print the address of all the object and see what it is;
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
    }
}
