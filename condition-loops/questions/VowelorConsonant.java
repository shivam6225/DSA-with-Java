package questions;

import java.util.Scanner;

public class VowelorConsonant {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char ch = input.next().charAt(0);

        switch (ch){
            case 'a' ,'e' ,'i' ,'o' ,'u' ,'A' ,'E' ,'I' ,'O' ,'U' -> System.out.println("Character is Vowel");
            default -> System.out.println("Character is Consonant");
        }
    }
}
