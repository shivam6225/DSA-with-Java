package shivam.questions;

import java.util.Scanner;

public class TwoNumOperators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter First Number");
        int a = input.nextInt();
        System.out.println("Please Enter Second Number");
        int b = input.nextInt();
        System.out.println("Please Enter Operator (+, -, *, /)");
        char operator = input.next().charAt(0);

        if(operator == '+') {
            System.out.println("Addition is: " + (a + b));
        } else if (operator == '-') {
            System.out.println("Subtraction is: " + (a - b));
        } else if (operator == '*') {
            System.out.println("Multiplication is: " + (a * b));
        } else if (operator == '/') {
            if (b != 0) {
                System.out.println("Division is: " + ((double) a / b));
            } else {
                System.out.println("Error: Division by zero is not allowed.");
            }
        } else {
            System.out.println("Invalid operator. Please use +, -, *, or /.");
        }
        
    }
}
