package Day_32_sep_08;

import java.io.FileWriter;
import java.io.IOException;

public class B {
    public static void main(String[] args) {
        try {
            FileWriter fw=new FileWriter("E://test_psa//test.txt",true);//append true means not override file
            fw.write("suraj");
            fw.write("\n");
            fw.write("india");
            fw.write("\n");
            fw.write("test");
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
