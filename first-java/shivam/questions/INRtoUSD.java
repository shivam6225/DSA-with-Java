package shivam.questions;

import java.util.Scanner;

public class INRtoUSD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please Enter Amount in INR");
        double inr = input.nextDouble();
        double usd = inr / 95.0; // Assuming 1 USD = 95 INR
        System.out.println("Amount in USD: " + usd);
        input.close();
    }
}
