package questions;

import java.util.Scanner;

public class FactorsOfNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        System.out.println("Factors are: ");
        int c=1;
        while(c*c<=num){
            if(num%c==0){
                System.out.println(c +","+num/c);
            }
            c++;
        }

    }
}
