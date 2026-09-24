import java.util.ArrayList;

public class Operators {

    public static void main(String[] args) {

        //+ is converting to ASCII value and adding that
        System.out.println('a'+'b');
        //Concatenated the String
        System.out.println("a"+"b");

        System.out.println((char)('a'+3));

        //Note : When a Integer is concatenated with String
        //int is converted to Integer , that will call toString()
        System.out.println("a"+3);

        //Arrays.toString is called -> []
        System.out.println("Kunal"+ new ArrayList<>());

        System.out.println("Kunal" + new Integer(56));

        //Operator + can't be applied here
        //Atleast one of the value needs to be of Type String
        //System.out.println(new Integer(56) + new ArrayList<>());

        String ans = new Integer(56) +" "+ new ArrayList<>();
        System.out.println(ans);

        //Operator - can't be applied to String
        //+ is overloaded for String type in Java
        //Operator Overloading

        //Java doesn't allow users to do operator overloading
        //Only String + is overloaded by default

        System.out.println("a"+'b');
    }
}
