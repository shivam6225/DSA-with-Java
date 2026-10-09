package singleton;


//Class that can have only 1 object
//We shouldn't allow anyone to call the constructor of the class
public class Singleton {

    private Singleton() {

    }

    private static Singleton instance;

    public static Singleton getInstance() {

        //check whether 1 obj only is created or not
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
