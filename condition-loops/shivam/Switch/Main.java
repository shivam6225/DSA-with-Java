package shivam.Switch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fruit = input.next();

        //We can do this by If and else if ladder
        //but it is not a good approach because it will take more time to execute the program
        //So we can use switch case statement to do this
        //in if(fruit.equals("Mango")) 
        //.equals() method is used to compare the string values 
        //because == operator is used to compare the reference of the string not the value of the string
        //Suppose a="Mango" and b="Mango" then a==b will return false because a and b are two different objects in the memory
        //Hence we use .equals() method to compare the string values

        //switch case statement is used to execute one block of code among many options
        //case is used to define the options and break is used to exit the switch case statement
        //case data type should be same as the switch data type
        //case is either a constant expression or a literal value
        //default is used to execute the block of code when none of the case matches
        //break statement is used to exit the switch case statement otherwise it will execute the next case also
        //switch case takes less time to execute than if else if ladder because it uses jump table to execute the code

        //this is switch old syntax in java 7 and below
        switch (fruit) {
            case "Mango":
                System.out.println("King of Fruits");
                break;
            case "Apple":
                System.out.println("A sweet red fruit");
                break;
            case "Banana":
                System.out.println("A yellow fruit");
                break;
            case "Grapes":
                System.out.println("A small fruit");
                break;
            default:
                System.out.println("Please enter a valid fruit name");  
        }

        //this is switch new syntax in java 12 and above
        //in this we don't need to use break statement because it will automatically exit the switch case statement
        //we can use -> operator to define the block of code to be executed for each case
        //we can also use yield statement to return a value from the switch case statement
        //Example: int result = switch (fruit) { case "Mango" -> 1; case "Apple" -> 2; default -> 0; };
        //we can also use multiple statements in a single case block by using {} braces
        //Example: case "Mango" -> { System.out.println("King of Fruits"); System.out.println("This is a fruit"); }
        //we can also use multiple case labels for a single block of code
        //Example: case "Mango", "Apple" -> System.out.println("This is a fruit");
        switch (fruit) {
            case "Mango" -> System.out.println("King of Fruits");
            case "Apple" -> System.out.println("A sweet red fruit");
            case "Banana" -> System.out.println("A yellow fruit");
            case "Grapes" -> System.out.println("A small fruit");
            default -> System.out.println("Please enter a valid fruit name");
        }

        //Weekday and Weekend using switch for day 1 to 7

        int day = input.nextInt();
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
            default -> System.out.println("Please enter a valid day number");   
        }

        
        
    }
}
