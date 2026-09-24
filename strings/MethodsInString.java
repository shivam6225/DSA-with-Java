import java.util.Arrays;

public class MethodsInString {

    public static void main(String[] args) {
        String name = "Shivam Pahariya";

        System.out.println(Arrays.toString(name.toCharArray()));

        //creates a new object
        System.out.println(name.toLowerCase());

        System.out.println(name.indexOf('v'));

        System.out.println(name.lastIndexOf('a'));

        System.out.println("    Shivam".strip());

        System.out.println(Arrays.toString(name.split(" ")));

    }
}
