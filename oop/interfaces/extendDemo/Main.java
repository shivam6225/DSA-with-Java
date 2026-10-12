package interfaces.extendDemo;

public class Main implements B{
    //The Access Modifier for the overridden method should be same or better than base class
    //Suppose if Base class method id protected then Child Class should be
    //protected or better than protected
    @Override
    public void greet() {
        System.out.println("Greetings");
    }

    @Override
    public void fun() {
        System.out.println("Have Fun");
    }

    public static void main(String[] args) {
        Main obj = new Main();

        A.greeting();
    }
}
