package ClassMain;

public class WrapperExample {

    public static void main(String[] args) {
        int a = 10;
        int b=20;

        //Integer num = new Integer(45);
        //final class
        //final -> keyword , you can prevent the content to be modified
        Integer a1 = 45;
        Integer b1 = 20;

        swap(a,b);

        System.out.println(a+" "+b);

        swap(a1,b1);
        //behave same as normal int , it won't change original value
        System.out.println(a1+" "+b1);

        final int bonus =2;
        //bonus = 4; -> can't be modified


        final A Shivam = new A("Shivam");
        Shivam.name = "Rahul";

        //Shivam = new A("new object"); -> this will fail

        A obj;

        for (int i = 0; i < 10000000; i++) {
            obj = new A("Shivammmmm");
        }


    }

    static void swap( int a , int b){
        int temp =a;
        a=b;
        b=temp;
    }

    static void swap( Integer a , Integer b){
        Integer temp =a;
        a=b;
        b=temp;
    }
}


class A {
    //final variable need to be initialized while declaring it
    final int num = 34 ;
    //final guarantees immutability only when primitive
    //for Wrapper classes , the reference will never change but value can be changed
    String name;

    public A(String name) {
        System.out.println("Object is created");
        this.name = name;
    }

    //Garbage Collector
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}
