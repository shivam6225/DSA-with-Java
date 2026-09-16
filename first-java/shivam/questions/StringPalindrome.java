package shivam.questions;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter a String");
        String str = input.nextLine();

        // String reversedStr = new StringBuilder(str).reverse().toString();
        // if(str.equals(reversedStr)) {
        //     System.out.println("The string is a palindrome.");
        // } else {
        //     System.out.println("The string is not a palindrome.");  
        // }
        // input.close();

        //Second Method
        int left =0;
        int right = str.length() -1;
        boolean isPalindrome = true;
        while(left<right){
            if(str.charAt(left) != str.charAt(right)){
                isPalindrome = false;
                break;  
            }
            left++;
            right--;
        }

        if(isPalindrome){
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");  
        }
        input.close();


    }
}
