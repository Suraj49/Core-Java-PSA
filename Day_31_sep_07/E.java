package Day_31_sep_07;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class E {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("E://test_psa//test.txt");
            fw.write("hello suraj");
            fw.close();

        }catch (IOException e){
            System.out.println(e);
        }

    }
}
