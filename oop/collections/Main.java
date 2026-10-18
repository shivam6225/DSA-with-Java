package collections;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        //List -> parent
        //ArrayList -> Child
        List<Integer> list = new ArrayList<>();

        List<Integer> list2 = new LinkedList<>();

        list2.add(34);
        list2.add(78);
        list2.add(89);

        System.out.println(list2);

        //Only use for Multi threading as it's relatively slow
        List<Integer> vector = new Vector<>();
        vector.add(45);
        vector.add(55);
        vector.add(34);
        vector.add(29);

        System.out.println(vector);
    }
}
