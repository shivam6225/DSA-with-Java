package shivam;

public class Basics {
    public static void main(String[] args) {

        int a = 10; //Integer data type
        if (a == 10) {
            System.out.println("a is equal to 10");
        }
        else {
            System.out.println("a is not equal to 10");
        }

        int count = 1;
        //While loop is used to iterate a block of code while a condition is true.
        //It is used when we don't know the number of iterations in advance.
        //intialization; condition;
        //increment/decrement is done inside the loop
        while (count <= 5) {
            System.out.println("Count is: " + count);
            count++;    
        }


        //For loop is used to iterate a block of code for a specific number of times.
        //It is used when we know the number of iterations in advance.
        //intialization; condition; increment/decrement
        for (int i = 1; i<=5; i++) {
            System.out.println("i is: " + i);
        }
        
    }
}
