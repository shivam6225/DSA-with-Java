package shivam;

import java.util.Scanner;

public class SumFunction {
    public static void main(String[] args) {
        //Suppose I have to find sum of two numbers 10 times
        //Take input 10 times and print sum of two numbers
        //Repetitive code is not good practice, so we will create a function to find sum of two numbers
        //We are calling the function sum() that will take input and print sum of two numbers
        sum();
        //result reference variable will save the returned value
        int result = sum2();
        System.out.println("Sum of two numbers is: " + result);

        //passing the argument for sum
        int ans = sum3(20,30);
        System.out.println(ans);
    }
    //void because this function will not return any value, it will just take input and print sum of two numbers
    //static because we are calling this function from static main method
    static void sum() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = input.nextInt();
        System.out.print("Enter second number: ");
        int b = input.nextInt();
        int sum = a + b;
        System.out.println("Sum of " + a + " and " + b + " is: " + sum);
    }

    //This function will return the sum of two numbers, so we will use return type as int
    static int sum2() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = input.nextInt();
        System.out.print("Enter second number: ");
        int b = input.nextInt();
        return a + b;
        //This will never execute
        //System.out.println("This will never execute");
    }

    //pass the value of numbers when you are calling the method in main()
    static int sum3(int a , int b){
        int sum = a+b;
        return sum;
    }
    
}
