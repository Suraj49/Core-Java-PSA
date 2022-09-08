package Day_32_sep_08;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class C {
    public static void main(String[] args) {
        try {
            FileWriter fw=new FileWriter("E://test_psa//test.txt");
            BufferedWriter bw=new BufferedWriter(fw);
            bw.write("hello");
            bw.newLine();
            bw.write("suraj");
            bw.newLine();
            bw.write("mike");
            bw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
