package questions;

import java.util.Scanner;

public class EvenOddFunction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();

        evenOdd(a);


    }

    private static void evenOdd(int a) {
        if(a%2==0){
            System.out.println("Number is Even");
        }
        else{
            System.out.println("Number is odd");
        }
    }
}
