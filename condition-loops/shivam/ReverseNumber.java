package shivam;

import java.util.Scanner;

//This program is used to reverse a number
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        //We can use while loop to reverse a number
        //We can use modulus operator to get the last digit of the number and
        // then divide the number by 10 to remove the last digit
        //We can repeat this process until the number becomes 0
        int reverse = 0;

        while(num>0){
            int digit = num%10;
            reverse = reverse*10 + digit;
            num /=10;
        }

        System.out.println("The reversed Number is: "+ reverse);
    }
}
