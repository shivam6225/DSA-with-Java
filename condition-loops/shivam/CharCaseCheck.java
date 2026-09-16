package shivam;

import java.util.Scanner;

public class CharCaseCheck {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        //As nextChar() method is not available in Scanner class, 
        // we can use next() method to read a string and then use charAt(0) method to get the first character of the string.
        //trim() method is used to remove any leading or trailing whitespace from the input string.
        //charAt(0) method is used to get the first character of the string.
        //charAt returns character type, so we can store it in a char variable.
        char ch = input.next().trim().charAt(0);

        //Check if the character is uppercase or lowercase
        //&& operator means AND operator, it checks if both conditions are true.
        //|| operator means OR operator, it checks if at least one condition is true.
        if(ch>='A' && ch<='Z'){
            System.out.println("Uppercase");
        }else if(ch>='a' && ch<='z'){
            System.out.println("Lowercase");
        }else{
            System.out.println("Not an alphabet");      
        }
        input.close();
    }
}
