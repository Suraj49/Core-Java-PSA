package Day_31_sep_07;

import java.io.FileWriter;
import java.io.IOException;

public class F {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("E://test_psa//test.txt");
            char[] a={'a','b','c','d','e'};
            fw.write(a);
            fw.close();


        }catch (IOException e){
            System.out.println(e);
        }

    }
}
