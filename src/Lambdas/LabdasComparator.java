package Lambdas;
import java.util.*;

public class LabdasComparator {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(23);
        list.add(73);
        list.add(28);
        list.add(43);
        list.add(29);
        list.add(53);
        list.add(93);

        Collections.sort(list,(x,y)->{
            return x-y;
        });

        System.out.println(list);
    }
}
