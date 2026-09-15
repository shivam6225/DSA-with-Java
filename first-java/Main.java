//File Name should be a public class name
//File Name starting with a uppercase letter is good practice
//Public means that the class is accessible from other classes/packages
public class Main {
    //Method -> main is the entry point of the program 
    //main is reserved keyword in Java
    //Without main method, the program will not run , hence it is public
    //Inorder to run the program , we need to create an object of the class and call the main method
    //Some method might not depend on the object of the class, hence we can make it static
    //This allows us to call the main method without creating an object of the class
    //static means that the method belongs to the class rather than an instance of the class
    //void is the return type of the method, it means that the method does not return any value
    //Command line arguments are passed to the main method as an array of strings, hence the parameter is String[] args
    //We can print the command line arguments using System.out.println(Arrays.toString(args));
    //javac main.java -> This command will compile the main.java file and create a main.class file
    //javac -d . -> This command will compile all the java files in the current directory and create .class files for each of them
    //javac -d .. Main.java -> This command will compile the Main.java file and create a Main.class file in the parent directory
    public static void main(String[] args) {
        System.out.println("Hello World");
    }

}