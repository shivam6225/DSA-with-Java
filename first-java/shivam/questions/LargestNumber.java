package shivam.questions;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter First Number");
        int a = input.nextInt();
        System.out.println("Please Enter Second Number");
        int b = input.nextInt();

        if(a > b) {
            System.out.println("Largest Number is: " + a);
        } else if (b > a) {
            System.out.println("Largest Number is: " + b);
        } else {
            System.out.println("Both numbers are equal.");
        }
        input.close();
    }
}
