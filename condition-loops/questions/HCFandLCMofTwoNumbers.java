package questions;

import java.util.Scanner;

public class HCFandLCMofTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();

        int x = a;
        int y = b;

        while(b!=0){
            int temp = b;
            b = a % b;
            a = temp;
        }


        System.out.println("HCF and LCM of number: "+ a + " "+ (x*y)/a);
    }
}
