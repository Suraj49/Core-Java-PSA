package Day_32_sep_08;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class A {
    public static void main(String[] args) {
        try {
            FileReader fr=new FileReader("E://test_psa//test.txt");
            BufferedReader br=new BufferedReader(fr);
            for (int i=0;i<3;i++) {
                System.out.println(br.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
