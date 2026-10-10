package Properties.Inheritance;

public class Main {
    //Multiple Inheritance is not allowed in Java
    //Alternative is Interfaces
    //Hierarchical Inheritance follows same rule as Single Inheritance
    //Hybrid Inheritance is combination of Single and Multiple Inheritance
    //Hybrid -> not allowed directly in Java -> need to use Interface
    public static void main(String[] args) {

        Box box = new Box(4,3,7.9);
        Box box2 = new Box(box);
        //Child class variables/methods can't be accessed by Parent Class object

        System.out.println(box.length+" "+ box.width+" "+ box.height);
        System.out.println(box2.length+" "+ box2.width+" "+ box2.height);

        BoxWeight box3 = new BoxWeight();
        BoxWeight box4 = new BoxWeight(2,3,4,5);
        System.out.println(box3.length+" "+ box3.width+" "+ box3.height+" "+box3.weight);
        System.out.println(box4.length+" "+ box4.width+" "+ box4.height+" "+box4.weight);

        //Type of the reference variable determines what can be accessed
        //When a reference of subclass object is passed to super class
        //It will only be able to access super class methods/variables
        Box box5 = new BoxWeight(2,3,4,5);
        //It won't be able to access weight variable
        System.out.println(box5);
        //box5.weight can't be used
        System.out.println(box5.length+" "+ box5.width+" "+ box5.height+" ");

        //BoxWeight box6 = new Box(); -> when a parent is used to refer child , it fails
        //there are many variables in both parent and child classes
        //you are given access to variables that are in the ref type i.e. child class
        //hence , you should have access to weight
        //this also means , the variables you are trying to access should be initialized
        //obj is of parent class hence leading to issue


        BoxWeight box6 = new BoxWeight(box4);
        System.out.println(box6.length+" "+ box6.width+" "+ box6.height+" "+box6.weight);

        BoxPrice box7 = new BoxPrice();
        System.out.println(box7.length+" "+ box7.width+" "+ box7.height+" "+box7.weight+" "+box7.price);

        BoxPrice box8 = new BoxPrice(5,8,200);
        System.out.println(box8.length+" "+ box8.width+" "+ box8.height+" "+box8.weight+" "+box8.price);

        BoxPrice box9 = new BoxPrice(5, 10 ,15 ,8,200);
        System.out.println(box9.length+" "+ box9.width+" "+ box9.height+" "+box9.weight+" "+box9.price);

        BoxPrice box10 = new BoxPrice(box8);
        System.out.println(box10.length+" "+ box10.width+" "+ box10.height+" "+box10.weight+" "+box10.price);

        Box.greeting();
        Box box11 = new BoxWeight();
        box11.greeting(); //static function didn't get overridden
        //Child class greeting wasn't called. Base Class Greeting was called
        BoxPrice.greeting();

    }
}
