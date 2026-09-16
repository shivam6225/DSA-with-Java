package shivam;

public class Scope {
    //Scope means where we can access the variables
    public static void main(String[] args) {
        int a=10;
        int b=20;
        //These can be accessed only in main function
        //Called as Function Scope
        //Can be accessed only in the function
        //Block Scope
        {
            //This will throw an error as variable a is already initialized outside the block in the same method
            //Hence cannot initialize again
            //int a = 78;
            a=100;
            //We can change the original ref variable value to some other value
            int c = 99;
            //Value initialized in this block
            //Will remain in this block
        }

        //This will throw error
        //System.out.println(c);
    }
}
