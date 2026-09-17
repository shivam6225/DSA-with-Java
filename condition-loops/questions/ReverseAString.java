package questions;

import java.util.Scanner;

public class ReverseAString {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str = input.next();

        String reversed = new StringBuilder(str).reverse().toString();

        System.out.println("Reverse String: "+ reversed);
    }
}
