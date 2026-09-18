package questions;

import java.util.Scanner;

public class MaxMinIn3Num {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        maxMin(a,b,c);

    }

    private static void maxMin(int a, int b, int c) {
        int max = 0;
        int min = 0;

        if(a>=b){
           max= Math.max(a,c);
           min = Math.min(c,b);
        }
        if(b>=c){
            max= Math.max(b,a);
            min = Math.min(a,c);
        }
        if(c>=a) {
            max = Math.max(c,b);
            min = Math.min(a,b);
        }
        System.out.println("Max and Min numbers are "+ max +" "+ min);

    }
}
