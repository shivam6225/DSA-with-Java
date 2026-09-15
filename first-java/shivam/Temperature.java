package shivam;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter temperature in Celsius:");
        float celsius = input.nextFloat();
        //Here we are taking input from the user using Scanner class.
        //nextFloat() method is used to take input of float data type.
        float fahrenheit = (celsius * 9/5) + 32;
        //Here we are converting temperature from Celsius to Fahrenheit using the formula:
        //Fahrenheit = (Celsius * 9/5) + 32
        System.out.println("Temperature in Fahrenheit is "+ fahrenheit);
        input.close();
        //We are closing the Scanner object to prevent memory leak.
        
    }
}
