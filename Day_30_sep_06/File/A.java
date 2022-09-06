package Day_30_sep_06.File;

import java.io.File;

public class A {
    public static void main(String[] args) {
        File file=new File("E://test_psa//test.txt");
        boolean val=file.exists();//if file is present then it will return ture otherwise false
        //it is non-static method present in file class.
        //return type of exists method is boolean
        System.out.println(val);
    }
}
