package questions;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();

        int result = sum(a,b);

        System.out.println("Sum of Two Numbers "+ result);
    }

    private static int sum(int a, int b) {

        return a+b;
    }
}
