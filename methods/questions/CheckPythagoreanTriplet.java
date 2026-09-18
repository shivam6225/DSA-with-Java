package questions;

import java.util.Scanner;

public class CheckPythagoreanTriplet {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        pythagorean(a,b,c);

    }

    private static void pythagorean(int a, int b, int c) {

        if((a*a + b*b)==c*c){
            System.out.println("Pythagorean Triplet");
        }
        else if((c*c + b*b)==a*a){
            System.out.println("Pythagorean Triplet");
        }
        else if ((a*a + c*c)==b*b){
            System.out.println("Pythagorean Triplet");
        }
        else {
            System.out.println("Not a Pythagorean Triplet");
        }

    }
}
