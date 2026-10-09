package singleton;

public class Main {

    public static void main(String[] args) {
        //Singleton obj = new Singleton(); -> we can't create object for this class
        Singleton obj = Singleton.getInstance();

        System.out.println(obj);

        Singleton obj2 = Singleton.getInstance(); //It will return the already existing object

        System.out.println(obj2); // Same value as obj
    }
}
