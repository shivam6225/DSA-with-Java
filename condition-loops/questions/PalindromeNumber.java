package questions;

import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        int a = num;
        int revNum=0;

        while(a>0){
            int rem = a%10;
            revNum = revNum*10 + rem;
            a/=10;
        }

        System.out.println("Is Number Palindrome: "+ (num==revNum));
    }
}
