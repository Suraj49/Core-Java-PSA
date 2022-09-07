package Day_31_sep_07;

import java.io.FileReader;

//wap to read contain of file
public class B {
    public static void main(String[] args) {
        try {
            FileReader fr=new FileReader("E://test_psa//test.txt");
            int ch=fr.read(); //it will return integer value and read only one char
            System.out.println((char) ch);//

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
