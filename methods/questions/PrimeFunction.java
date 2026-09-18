package questions;

import java.util.Scanner;

public class PrimeFunction {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();

        prime(a);

    }

    private static void prime(int a) {

        int c=2;

        while(c*c<=a){
            if(a%c==0){
                System.out.println("Number is not prime");
                break;
            }
            c++;
        }

        if(c*c>a){
            System.out.println();
            System.out.println("Number is Prime");
        }
    }
}
