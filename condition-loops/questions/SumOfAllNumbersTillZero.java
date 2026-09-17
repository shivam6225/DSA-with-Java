package questions;

import java.util.Scanner;

public class SumOfAllNumbersTillZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum =0;
        while(true){
          int a = input.nextInt();
          if(a==0) break;
          sum+=a;
        }

        System.out.println("Total Sum:"+sum);

    }
}
