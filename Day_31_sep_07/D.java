package Day_31_sep_07;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class D {
    public static void main(String[] args) {
        try {
            File f=new File("E://test_psa//test.txt");
            long len=f.length();
            FileReader fr =new FileReader(f);
            char[] ch=new char[(int)len];
            fr.read(ch);
            fr.close();
            for (char x:ch){
                System.out.print(x);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
