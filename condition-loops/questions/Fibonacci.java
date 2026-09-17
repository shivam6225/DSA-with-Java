package questions;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int first = 0;
        int second = 1;
        int c =1;
        while(c<=n){
            System.out.print(first+" ");
            int temp = first;
            first = second;
            second = second+ temp;
            c++;
        }
    }
}
