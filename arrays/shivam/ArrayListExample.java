package shivam;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {

    public static void main(String[] args) {
        //When you don't know the size of array
        //You use Array List
        //default size but can be extended
        ArrayList<Integer> list = new ArrayList<>(5);
        //datatype shouldn't be primitive

        list.add(23);
        list.add(56);
        list.add(345);
        list.add(123);
        list.add(456);

        System.out.println(list);

        System.out.println(list.contains(345));
        list.set(0,99);
        System.out.println(list);
        list.remove(4);
        System.out.println(list);

        Scanner input = new Scanner(System.in);
        //input
        for(int i=0;i<5;i++){
            list.add(input.nextInt());
        }

        //output
        for(int i=0;i<9;i++){
            System.out.print(list.get(i)+" ");
        }

        //oldcapcity>>1
    }
}
