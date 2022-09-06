package Day_30_sep_06.File;

import java.io.File;
import java.io.IOException;


public class C {
    public static void main(String[] args) {
        File file=new File("E://test_psa//test.txt");


        try {
           boolean val=file.createNewFile();
            System.out.println(val);
            //createNewFile is non static method of file class
            //it will create new file and return true
            //if file is created then it will not override the file
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
