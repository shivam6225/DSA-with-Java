package staticExample;
//Static variable -> not dependent on object
public class Main {
    //Main - is declared as static
    //Static - You can use the main method , without creating the object of the class
    //Without Main Java program won't run
    //In Order to run any method , you need to create an object of class
    //But Main should run by default , hence it's static
    //Static belong to class not the object
    //No need of instance of a class
    //Static variables don't depend on object
    //Objects are created at runtime
    //Static are resolved during compiled time
    public static void main(String[] args) {
        Human shivam = new Human(25,"Shivam",1400,false);
        System.out.println(Human.population);
        Human rahul = new Human(36,"Rahul",1400,false);
        System.out.println(shivam);
        System.out.println(rahul);
        System.out.println(Human.population); //Best Practice
        System.out.println(rahul.population);

        //Non-Static methods can't be referenced from static methods
        //It can't access non-static data
        //greeting();
        fun();
        Human.message();

    }

    //Non-Static method belongs to object
    //Without creating an instance of class , you can't use it
    void greeting(){
        System.out.println("Non-Static method is called");
        //fun();
        //Static member is allowed inside the Non-Static object
    }

    //Not dependent on object
    //belongs to Class
    static void fun(){
        //greeting(); -> throws error
        //We don't know class instance hence , we can't use it
        System.out.println("Static Method is called");
        Main obj = new Main();
        System.out.println(obj);
        obj.greeting();
        //Created an object for Non-Static
    }
}
