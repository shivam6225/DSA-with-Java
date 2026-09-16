package shivam.questions;

import java.util.Scanner;

public class SimpleInterest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Principal Amount");
        double principal = input.nextDouble();
        System.out.println("Please Enter Rate of Interest");
        double rate = input.nextDouble();
        System.out.println("Please Enter Time in Years");
        double time = input.nextDouble();
        double simpleInterest = (principal * rate * time)/100;
        System.out.println("Simple Interest is: " + simpleInterest);
        input.close();
    }
}
