package Day_31_sep_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class C {
    public static void main(String[] args) {
        try {
            File f=new File("E://test_psa//test.txt");
            long len=f.length();
            FileReader fr =new FileReader(f);
            for (int i=0;i<len;i++){
                System.out.println((char)fr.read());
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
