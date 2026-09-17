package questions;

import java.util.Scanner;

public class ArmstrongNumberInJava {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        int a = num;
        int length = String.valueOf(num).length();
        int sum =0;
        while(a>0){
            int rem = a%10;
            sum += (int)Math.pow(rem,length);
            a /=10;
        }

        System.out.println("Is Number Armstrong:"+ (num==sum));
    }
}
