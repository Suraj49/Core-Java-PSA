package Day_30_sep_06.File;

import java.io.File;

public class D {
    public static void main(String[] args) {
        File file=new File("K://test_psa//test");
        boolean val=file.mkdir();
        System.out.println(val);
    }
}
