package Day_34_sep_10;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class D  {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("W");
        list.add("X");
        list.add("Y");
        list.add("Z");
        Spliterator<String> s1=list.spliterator();
        System.out.println(s1.getExactSizeIfKnown());
    }
}
