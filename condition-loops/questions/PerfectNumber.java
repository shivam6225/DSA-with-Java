package questions;

import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        int sum =0;
        int c=2;
        while(c*c<=num){
            if(num%c==0){
                sum+=c;
                if(num!=c*c) {
                    sum += (num / c);
                }
            }
            c++;
        }

        System.out.println("Is perfect number: "+ (num==sum+1));
    }
}
