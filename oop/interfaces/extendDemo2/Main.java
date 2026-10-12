package interfaces.extendDemo2;

public class Main implements A, B {
    @Override
    public void greet() {
        System.out.println("Greetings");
    }

    @Override
    public void fun() {
        System.out.println("Have Fun");
    }
}
