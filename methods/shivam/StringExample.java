package shivam;

public class StringExample {
    public static void main(String[] args) {
        String message = greet();
        System.out.println(message);

        String personalized = myGreet("Shivam");
        System.out.println(personalized);
    }

    private static String myGreet(String name) {
        String message = "Hello " + name;
        return message;
    }

    static String greet() {
        return "how are you";
    }
}
