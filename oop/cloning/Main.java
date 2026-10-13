package cloning;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Human kunal = new Human(23,"Kunal");
        //Human twin = new Human(kunal);
        Human twin = (Human)kunal.clone();

        System.out.println(kunal);
        System.out.println(twin);

        System.out.println("----------");

        twin.arr[0] = 100;
        //Shallow Copy -> pointing to same object
        System.out.println(kunal);
        System.out.println(twin);

        //deep copy
        Human twin2 = (Human)kunal.clone2();

        System.out.println(kunal);
        System.out.println(twin2);

        System.out.println("----------");

        twin2.arr[0] = 45;
        //Shallow Copy -> pointing to same object
        System.out.println(kunal);
        System.out.println(twin2);


    }
}
