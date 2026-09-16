package shivam;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap(a,b);
        System.out.println(a+","+b);
        String name="Shivam";
        changeName(name);
        System.out.println(name);
    }

    //Now this will point to different value , it won't change anything for the main method name
    //Object and References and Complex Data Types: passing value of the Reference variable
    //We are not modifying string , we are passing new value
    private static void changeName(String name) {
        name = "Prakhar";
    }

    //Primitives: int,short,char,byte -> its always pass by value
    static void swap(int num1 , int num2){
        int temp =num1;
        num1=num2;
        num2=temp;

        //This change is valid only in this function scope only
    }
    
}
