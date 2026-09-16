package shivam.questions;

import java.util.Scanner;


public class GreetingMessage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Your Name");
        String name = input.nextLine();
        System.out.println("Hello " + name + ", Welcome to Java Programming");
        input.close();
    }
}