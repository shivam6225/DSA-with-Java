package interfaces.extendDemo2;

public interface A {

    //This helps in extending the interface without breaking the code
    default void fun() {
        System.out.println("Hi!! ,I am in A");
    };
}
