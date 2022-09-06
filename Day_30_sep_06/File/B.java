package Day_30_sep_06.File;

import java.io.File;

public class B {
    public static void main(String[] args) {
        File file=new File("E://test_psa//test.txt");
        boolean val=file.delete();
        //return type of method is boolean
        //non static method of File class
        //if file is present then delete method will delete then file and return true else return false
        System.out.println(val);
    }
}
