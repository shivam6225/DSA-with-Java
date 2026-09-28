public class Message {

    public static void main(String[] args) {
        //write a function that prints hello world
        message();
        //Print hello world 5 times


    }

    static void message(){
        System.out.println("Hello World");
        //function is calling another function
        message1();
    }
    static void message1(){
        System.out.println("Hello World");
        message2();
    }
    static void message2(){
        System.out.println("Hello World");
        message3();
    }
    static void message3(){
        System.out.println("Hello World");
        message4();
    }
    static void message4(){
        System.out.println("Hello World");
    }
}
