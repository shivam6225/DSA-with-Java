public class ComparisonString {

    public static void main(String[] args) {
        String a ="Kunal";
        String b ="Kunal";

        // == -> check if ref variables are pointing to same object
        System.out.println( a == b);

        //Creates two different object in heap but OUTSIDE of String Pool
        a = new String("Kunal");
        b = new String("Kunal");
        String c = a;
        System.out.println(a==b);
        //Same as pointing to same object
        System.out.println(a==c);
        //To just compare values use the .equals() function
        System.out.println(a.equals(b));
    }
}
