package questions;

import java.util.Scanner;

public class LeapOrNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int year = input.nextInt();

        if(year%100==0){
            if(year%400==0){
                System.out.println("Leap year");
            }
            else{
                System.out.println("Not a Leap year");
            }
        } else if (year%4==0) {
            System.out.println("Leap year");
        }
        else {
            System.out.println("Not a Leap year");
        }
    }
}
