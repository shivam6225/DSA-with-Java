package questions;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();

        long result = factorial(a);

        System.out.println("Factorial is:"+ result);
    }

    private static long factorial(int a) {
        if(a==0 || a==1){
            return 1;
        }
        long fact = 1;
        for(int i=2;i<=a;i++){
            fact *= i;
        }

        return fact;
    }
}
