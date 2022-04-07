package gun03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListClass {
    public static void main(String[] args) {
        List<List<Integer>> listler = new ArrayList<>(); // POLYMORPHİSM

        listler.add(new ArrayList<>(Arrays.asList(1,2,3)));
        listler.add(new ArrayList<>(Arrays.asList(11,12,13)));

        System.out.println(listler);
    }
}
