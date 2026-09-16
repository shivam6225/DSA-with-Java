package shivam.questions;

import java.util.Scanner;
//Generate a program to check whether the given number is odd or even.
public class OddOrEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter Number");
        int a = input.nextInt();

        if(a%2==0){
            System.out.println("Number is Even");
        }
        else{
            System.out.println("Number is Odd");
        }
    }
}
