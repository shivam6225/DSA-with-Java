package staticExample;

//this is demo to show initialisation of static variables
public class StaticInitialize {

    static int a=4;
    static int b;

    //Static block , which gets executed exactly once when class is loaded
    //Will only run once , even if it's called again
    static {
        System.out.println("I am in static block");
        b=a*5;
    }

    public static void main(String[] args) {
        StaticInitialize obj = new StaticInitialize();

        System.out.println(StaticInitialize.b);

        StaticInitialize.b += 3;
        StaticInitialize obj2 = new StaticInitialize();
        System.out.println(StaticInitialize.b);
    }

}
