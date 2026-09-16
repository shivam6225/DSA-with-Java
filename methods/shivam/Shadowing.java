package shivam;

public class Shadowing {
    //This will be accessible by everything in Shadowing class
    static int x=90;
    public static void main(String[] args) {
        System.out.println(x); //90
        //Shadowing is practice of creating a same variable in lower scope
        //The higher scope variable will be shadowed
        //The lower level will overwrite the higher level
        int x; //the class variable at line 5 is shadowed by the function variable
        //System.out.println(x); -> this will give error as scope begin when value is initialized
        x=40; //initialized
        System.out.println(x); //40
        fun();
    }

    static void fun(){
        System.out.println(x);
    }
}
