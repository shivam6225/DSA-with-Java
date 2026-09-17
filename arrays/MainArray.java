public class MainArray {
    public static void main(String[] args) {
        int[] ros; //declaration -> ros is getting defined in stack
        ros = new int[5]; //initialization -> object is being created in memory

        System.out.println(ros[1]);
        //0

        String[] arr = new String[4];
        System.out.println(arr[0]);
        //null

        //null is literal
        //null can be assigned only to non-primitive

    }
}
