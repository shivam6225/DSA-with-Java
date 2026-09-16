package shivam;

public class PassingExample {

    public static void main(String[] args) {
        String name ="Shivam";
        greet(name);

    }
    //Pass by Value
    //Both reference variable name and naam point to same value
    private static void greet(String naam) {
        System.out.println(naam);
    }

}




