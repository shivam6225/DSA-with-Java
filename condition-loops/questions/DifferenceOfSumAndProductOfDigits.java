package questions;

import java.util.Scanner;

public class DifferenceOfSumAndProductOfDigits {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int sum =0 , product =1;
        while(a>0){
            int rem = a%10;
            product *=rem;
            sum +=rem;
            a /=10;
        }

        System.out.println("Difference of Product and Sum of Digits is "+ (product - sum));
    }
}
