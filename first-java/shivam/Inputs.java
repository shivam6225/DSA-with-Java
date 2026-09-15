package shivam;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter some input:");
        int rollno = input.nextInt();
        //Here we are taking input from the user using Scanner class.
        //nextInt() method is used to take input of int data type.
        System.out.println("Your roll no is "+ rollno);

        String name = input.next();
        //Here we are taking input from the user using Scanner class.
        //next() method is used to take input of String data type. It will take input till space is encountered.
        System.out.println("Your name is "+ name);

        String fullName = input.nextLine();
        //Here we are taking input from the user using Scanner class.
        //nextLine() method is used to take input of String data type. It will take input till the end of the line is encountered.
        System.out.println("Your full name is "+ fullName);

        float marks = input.nextFloat();
        //Here we are taking input from the user using Scanner class.
        //nextFloat() method is used to take input of float data type.
        System.out.println("Your marks are "+ marks);
    }
}
