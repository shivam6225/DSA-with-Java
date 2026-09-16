package shivam.questions;

import java.util.Scanner;

public class ArmstrongBetweenNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter Starting Number");
        int start = input.nextInt();
        System.out.println("Please Enter Ending Number");
        int end = input.nextInt();
        System.out.println("Armstrong numbers between " + start + " and " + end + " are:");

        //Armstrong number is a number that is equal 
        //to the sum of its own digits raised to the power of the number of digits. 
        //For example, 153 is an Armstrong number because 1^3 + 5^3 + 3^3 = 153.
        //Time Complexity: O(n * d), where n is the range of numbers and d is the number of digits in the number.
        for (int num = start; num <= end; num++) {
            int originalNum = num;
            int sum = 0;
            int digits = String.valueOf(num).length();
            while (originalNum != 0) {
                int digit = originalNum % 10;
                sum += Math.pow(digit, digits);
                originalNum /= 10;
            }
            if (sum == num) {
                System.out.print(num + " ");
            }
        }   
        input.close();
    }
}
