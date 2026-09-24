import java.util.Arrays;

public class StringOutput {

    public static void main(String[] args) {
        //out is ref variable of Type Class PrintStream
        //method is println
        //Function over-loading
        //toString method for print
        //toString(i)
        System.out.println(56);
        System.out.println("Kunal");
        //obj.toString()
        //toString -> getClass().getName() + "@" + Integer(hashcode)
        System.out.println(new int[]{2,3,4,5});

        //Pretty Print
        //I want Java to use my toString method
        //use toString method available in Arrays
        //Function Over riding , where we override toString method of PrintStream
        System.out.println(Arrays.toString(new int[]{2,3,4,5}));

        String name  =null;
        //direct null is returned
        System.out.println(name);
        //Integer wrapper class
        Integer num = new Integer(56);
        System.out.println(num.toString());
    }
}
