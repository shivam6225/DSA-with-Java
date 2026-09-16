package shivam;

import java.util.Scanner;

public class DigitOccursInANumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int digit = input.nextInt();
        int count =0;
        //We can use while loop to find the number of times a digit occurs in a number
        //We can use modulus operator to get the last digit of the number and 
        // then divide the number by 10 to remove the last digit
        //We can repeat this process until the number becomes 0
        while(n>0){
            int rem = n%10;
            if (rem == digit) {
                count++;
            }
            n /=10;
        }

        System.out.println("Number of times "+ digit +" occurs in number is: "+ count);
    }
}
