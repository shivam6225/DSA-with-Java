package shivam;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // out by default is command line - null ß
        System.out.println("hey how are you?");
        Scanner input = new Scanner(System.in);
        System.out.println(input.nextLine());
        input.close();
    }
}
