package questions;

import java.util.Scanner;

public class PrimeNumbersBetweenRange {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();

        primesInRange(a,b);

    }

    private static void primesInRange(int a, int b) {

        for(int i=a;i<=b;i++){
            int c=2;
            if(i<=1) continue;
            while(c*c<=i){
                if(i%c==0) { break ;}
                c++;
            }
            if(c*c>i){
                System.out.print(i+" ");
            }
        }
    }
}
