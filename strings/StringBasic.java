public class StringBasic {


    //Command line arguments will be stored in args in String format
    //These arguments we pass with java compile/runtime time
    public static void main(String[] args) {
        //String data type
        String name = "Shivam Pahariya";
        //Collection of Characters
        System.out.println(name);

        //String Pool - Separate Memory Structure Inside heap
        //Immutability - Strings can't be changed , Object is immutable - For security reason

        String a ="Kunal"; //GC will take it as ref is pointing to different object
        System.out.println(a);
        a="Pahariya"; //Ref Varible poiting to different object in heap (String Pool)
        System.out.println(a);
        String b ="Kunal";

        //to get character at index using charAt(idx)
        System.out.println(b.charAt(3));

    }
}
