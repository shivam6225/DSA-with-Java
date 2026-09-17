package questions;

import java.util.Scanner;

public class LargestInputNumberTillZero {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int max = 0;

        while(true){
            int a = input.nextInt();
            if(a==0) break;
            max = Math.max(max,a);
        }

        System.out.println("Max Number: "+ max);
    }
}
