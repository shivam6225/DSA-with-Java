package shivam;


import java.util.ArrayList;
import java.util.Scanner;

public class MultiArrayList {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        //initialization
        for(int i=0; i<3;i++){
            list.add(new ArrayList<>());
        }

        Scanner input = new Scanner(System.in);
        //add elements
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                list.get(i).add(input.nextInt());
            }
        }

        System.out.println(list);

    }
}
