package shivam;

import java.util.Scanner;

//This program finds the largest of three numbers entered by the user.
public class Largest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        //Assume a is largest
        //Maximum number is a
        //Check if b is greater than a
        //If yes, then maximum number is b
        //Check if c is greater than maximum number
        //If yes, then maximum number is c
        //Print the maximum number

        int max = a;
        if(b>max){
            max = b;
        }
        if(c>max){
            max =c;
        }

        System.out.println("Largest Number is: " + max);
        input.close();

        //Time Complexity: O(1)
        //Space Complexity: O(1)

        //Another approach is to use Math.max() method to find the largest number among three numbers.
        //int max = Math.max(Math.max(a, b), c);
        //System.out.println("Largest Number is: " + max);

        int max1 = Math.max(a, b);
        int max2 = Math.max(max1, c);
        System.out.println("Largest Number is: " + max2);

        //Time Complexity: O(1)
        //Space Complexity: O(1)

    }
}
