package StringToken;

import java.util.StringTokenizer;

public class A {
    public static void main(String[] args) {
        StringTokenizer token = new StringTokenizer("12-12-2000", "-");
        String last=null;
        while (token.hasMoreElements())
        {
            last= token.nextToken();
        }
        System.out.println(last);
    }
}

