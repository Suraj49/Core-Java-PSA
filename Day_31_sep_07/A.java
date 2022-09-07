package Day_31_sep_07;

import java.io.File;
//print no of file created into folder
//count total no of file into a folder
public class A {
    public static void main(String[] args) {
        File f=new File("E://test_psa//");
        String []name=f.list();
        for (String x:name){
            System.out.println(x);
        }
        System.out.println(name.length);
    }
}
